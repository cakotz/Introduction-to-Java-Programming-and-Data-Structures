public class Main {
    public static void main(String[] args) {
        //Creates two rectangle objects with specified widths and heights.
        Rectangle recOne = new Rectangle(4, 40);
        Rectangle recTwo = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle One" +
                        "\n-------------" +
                        "\nWidth: " + recOne.getWidth() +
                        "\nHeight: " + recOne.getHeight() +
                        "\nArea: " + recOne.getArea() +
                        "\nPerimeter: " + recOne.getPerimeter() + "\n" +
                        "\nRectangle Two" +
                        "\n-------------" +
                        "\nWidth: " + recTwo.getWidth() +
                        "\nHeight: " + recTwo.getHeight() +
                        "\nArea: " + recTwo.getArea() +
                        "\nPerimeter: " + recTwo.getPerimeter());
    }
}