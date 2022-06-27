public class YourOption {
        private int level;
        private int choice;

        YourOption(int level, int choice) {
            this.level = level;
            this.choice = choice;
        }

        public int getLevel() {
            return level;
        }

        public int getChoice() {
            return choice;
        }


        public void setLevel(int level) {
            this.level = level;
        }

        public void setChoice(int choice) {
            this.choice = choice;
        }
}
