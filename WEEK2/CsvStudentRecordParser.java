public class CsvStudentRecordParser {

    public static void parseStudentRecord(
            String csvLine) {

        String[] fields =
                csvLine.split(",", -1);

        if (fields.length == 3) {

            System.out.printf(
                    "Name: %s | Roll No: %s | Dept: %s%n",

                    fields[0].trim(),
                    fields[1].trim(),
                    fields[2].trim()
            );

        } else {

            System.out.println(
                    "Invalid Record"
            );
        }
    }

    public static void main(String[] args) {

        parseStudentRecord(
                "Ananya Verma,"
                        + "RA2211003010123,"
                        + "CSE"
        );

        parseStudentRecord(
                "Ananya Verma,CSE"
        );
    }
}