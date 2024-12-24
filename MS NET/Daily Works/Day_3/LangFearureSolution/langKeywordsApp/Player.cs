namespace Sports{
    public class Player:IComparable<Player>{
        public string Name { get; set; }
        public int Age { get; set; }
        public int Score { get; set; }
        public int Rank { get; set; }

        public int CompareTo(Player? other)
        {
            if (other == null) return 1;
            return this.Age.CompareTo(other.Age);
        }
    }
}

