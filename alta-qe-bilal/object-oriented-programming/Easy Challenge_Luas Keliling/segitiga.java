public class segitiga {
        int alas;
        int tinggi;

        public segitiga(int alas, int tinggi) {
            this.alas = alas;
            this.tinggi = tinggi;

        }

        public int menghitungLuasSegitiga() {
            return
                    this.alas * this.tinggi / 2;
        }

        public int menghitungKelilingSegitiga() {
            return
                    this.alas * this.tinggi;
        }
    }

