namespace LMS{
    public class Library{
        private List<Book> books;

        public Library(){
            books = new List<Book>();
        }
        public void AddBook(Book book){
            books.Add(book);
        }
        public void RemoveBook(Book book){
            books.Remove(book);
        }
        public void IssueBook( Book theBook ){
            this.RemoveBook(theBook);
            Console.WriteLine("Book Issued");
        }

        //Indexer
        //Smart Array   
        public Book this[int index]{
            get{
                return books[index];
            }
            set{
                books[index]=value;
            }
        }
    }
}