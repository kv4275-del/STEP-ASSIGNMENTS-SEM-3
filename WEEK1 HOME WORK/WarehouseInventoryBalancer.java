public class WarehouseInventoryBalancer {

    public static void analyzeInventory(
            int[] sectionA,
            int[] sectionB) {

        int totalA = 0;
        int totalB = 0;

        int highestQuantity =
                Integer.MIN_VALUE;

        String highestSection = "";

        int highestIndex = -1;

        for (int i = 0;
             i < sectionA.length;
             i++) {

            totalA += sectionA[i];

            if (sectionA[i]
                    > highestQuantity) {

                highestQuantity =
                        sectionA[i];

                highestSection =
                        "Section A";

                highestIndex = i;
            }
        }

        for (int i = 0;
             i < sectionB.length;
             i++) {

            totalB += sectionB[i];

            if (sectionB[i]
                    > highestQuantity) {

                highestQuantity =
                        sectionB[i];

                highestSection =
                        "Section B";

                highestIndex = i;
            }
        }

        String balanceStatus =
                (totalA == totalB)
                        ? "Status: Balanced"
                        : "Status: Not Balanced";

        System.out.printf(
                "Section A Total: %d | "
                        + "Section B Total: %d | "
                        + "%s | "
                        + "Highest Quantity: %d "
                        + "(%s, Item %d)%n",

                totalA,
                totalB,
                balanceStatus,
                highestQuantity,
                highestSection,
                highestIndex
        );
    }

    public static void main(String[] args) {

        int[] sectionA =
                {10, 15, 35};

        int[] sectionB =
                {25, 10, 25};

        analyzeInventory(
                sectionA,
                sectionB
        );
    }
}