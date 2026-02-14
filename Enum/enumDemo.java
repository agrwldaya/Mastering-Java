
class enumDemo{
    public static void main(String[] args) {
        // Enum is a special data type that enables for a variable to be a set of predefined constants.
        // The variable must be equal to one of the values that have been predefined for it.

        // enum Day {
        //     SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY     --- these are the objects of the enum Day
        // }

        // Day day = Day.MONDAY;
        // System.out.println(day);

        // Enums can have fields, methods, and constructors
        enum Color {
            RED("Red Color"), 
            GREEN("Green Color"), 
            BLUE("Blue Color");

            private String description;

            Color(String description) {
                this.description = description;
            }

            public String getDescription() {
                return description;
            }
        }

        Color color = Color.RED; // RED is a object of the enum Color
        System.out.println("object name: " + color); // Output: RED
        System.out.println(color.getDescription()); // Output: Red Color
    }
}