public class ProductInventoryParser {

    public static void parseInventoryRecord(
            String csvLine) {

        String[] fields =
                csvLine.split(",", -1);

        if (fields.length == 3) {

            String product =
                    fields[0].trim();

            String sku =
                    fields[1].trim();

            String quantity =
                    fields[2].trim();

            System.out.printf(
                    "Product: %s | SKU: %s | Qty: %s%n",

                    product,
                    sku,
                    quantity
            );

        } else {

            System.out.println(
                    "Invalid Record"
            );
        }
    }

    public static void main(String[] args) {

        parseInventoryRecord(
                "Wireless Mouse,"
                        + "WM-2001,"
                        + "150"
        );

        parseInventoryRecord(
                "Wireless Mouse,150"
        );
    }
}