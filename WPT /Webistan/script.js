
function loadUsers() {
    return JSON.parse(localStorage.getItem('users')) || [];
}

function saveUsers(users) {
    localStorage.setItem('users', JSON.stringify(users));
}


document.getElementById('signupForm')?.addEventListener('submit', function(event) {
    event.preventDefault();

    const username = document.getElementById('username').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    const users = loadUsers();
    const userExists = users.some(user => user.email === email || user.username === username);

    if (userExists) {
        alert('Existing email or username. Please try another.');
        return;
    }

    users.push({ username, email, password });
    saveUsers(users);
    alert('Account created successfully! You can sign in now.');
    window.location.href = 'signin.html';
});


document.getElementById('signinForm')?.addEventListener('submit', function(event) {
    event.preventDefault();

    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    const users = loadUsers();
    const user = users.find(user => user.email === email);

    if (!user) {
        alert('Email not found. Please sign up.');
        return;
    }

    if (user.password !== password) {
        alert('Input correct password.');
        return;
    }

    alert('Sign in successful!');
 
    window.location.href = 'index.html';
});


function loadBookings() {
    return JSON.parse(localStorage.getItem('bookings')) || [];
}


function saveBookings(bookings) {
    localStorage.setItem('bookings', JSON.stringify(bookings));
}


document.getElementById('bookingForm')?.addEventListener('submit', function(event) {
    event.preventDefault();

    const fullName = document.getElementById('fullName').value;
    const email = document.getElementById('email').value; 
    const pickupLocation = document.getElementById('pickupLocation').value;
    const pickupDate = document.getElementById('pickupDate').value;
    const returnDate = document.getElementById('returnDate').value;

    const bookings = loadBookings();
    bookings.push({ fullName, email, pickupLocation, pickupDate, returnDate });

    saveBookings(bookings);
    alert('Booking Confirmed!');
    window.location.href = 'bookings.html';
});


function displayBookings() {
    const bookingListDiv = document.getElementById('booking-list');
    if (!bookingListDiv) return;

    const bookings = loadBookings();
    bookingListDiv.innerHTML = '';

    bookings.forEach((booking, index) => {
        const bookingDiv = document.createElement('div');
        bookingDiv.classList.add('col-md-4', 'mb-4');
        bookingDiv.innerHTML = `
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Booking #${index + 1}</h5>
                    <p class="card-text">Full Name: ${booking.fullName}</p>
                    <p class="card-text">Email: ${booking.email}</p>
                    <p class="card-text">Pick-up Location: ${booking.pickupLocation}</p>
                    <p class="card-text">Pick-up Date: ${booking.pickupDate}</p>
                    <p class="card-text">Return Date: ${booking.returnDate}</p>
                    <button class="btn btn-primary" onclick="openEditModal(${index})">Edit Booking</button>
                    <button class="btn btn-danger" onclick="deleteBooking(${index})">Cancel Booking</button>
                </div>
            </div>
        `;
        bookingListDiv.appendChild(bookingDiv);
    });
}


function openEditModal(index) {
    const bookings = loadBookings();
    const booking = bookings[index];

    document.getElementById('editFullName').value = booking.fullName;
    document.getElementById('editEmail').value = booking.email;
    document.getElementById('editPickupLocation').value = booking.pickupLocation;
    document.getElementById('editPickupDate').value = booking.pickupDate;
    document.getElementById('editReturnDate').value = booking.returnDate;
    document.getElementById('editIndex').value = index;

    $('#editBookingModal').modal('show');
}

document.getElementById('editBookingForm')?.addEventListener('submit', function(event) {
    event.preventDefault();

    const index = document.getElementById('editIndex').value;
    const updatedBooking = {
        fullName: document.getElementById('editFullName').value,
        email: document.getElementById('editEmail').value,
        pickupLocation: document.getElementById('editPickupLocation').value,
        pickupDate: document.getElementById('editPickupDate').value,
        returnDate: document.getElementById('editReturnDate').value
    };

    const bookings = loadBookings();
    bookings[index] = updatedBooking; 

    saveBookings(bookings);
    $('#editBookingModal').modal('hide');
    displayBookings();
    alert('Booking updated successfully!');
});


function deleteBooking(index) {
    const bookings = loadBookings();
    bookings.splice(index, 1);
    saveBookings(bookings);
    displayBookings();
    alert('Booking canceled successfully!');
}


window.onload = displayBookings;
