public class CarCalculator
{
    private static final double BASE_PRICE = 12000.0;

    public enum Color {
        WHITE(1.0),
        BLUE(1.0),
        YELLOW(1.1),
        RED(1.0),
        PREADOLESCENT(1.2),
        METALLIC_GRAY(1.3);

        private final double coefficient;

        Color(double coefficient) {
            this.coefficient = coefficient;
        }

        public double getCoefficient() {
            return coefficient;
        }
    }

    public enum Part {
        HOOD(1.0),
        FRONT_DOOR(1.2),
        REAR_DOOR(1.1),
        FRONT_BUMPER(1.0),
        REAR_BUMPER(1.0),
        ROOF(1.1);

        private final double coefficient;

        Part(double coefficient) {
            this.coefficient = coefficient;
        }

        public double getCoefficient() {
            return coefficient;
        }
    }

    public static double calculatePaintingCost(Part part, Color color) {
        return BASE_PRICE * part.getCoefficient() * color.getCoefficient();
    }
}