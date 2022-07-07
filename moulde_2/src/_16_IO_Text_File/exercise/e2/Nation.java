package _16_IO_Text_File.exercise.e2;

public class Nation {
        public String id;
        public String code;
        public String name;

        public Nation() {
        }

        public Nation(String id, String code, String name) {
            this.id = id;
            this.code = code;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Nation{" +
                    "id='" + id + '\'' +
                    ", code='" + code + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
}
