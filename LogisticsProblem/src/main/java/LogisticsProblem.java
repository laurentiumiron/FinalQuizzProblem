import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Lau on 11/15/2017.
 */

public class LogisticsProblem {
    public LogisticsProblem() throws FileNotFoundException {


    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {


        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");

        File f1 = new File("C:\\Users\\Lau\\IdeaProjects\\LogisticsProblem\\package.csv");
        Scanner scanner = new Scanner(f1);
        List<DeliveryPackage> packagesList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String data[] = scanner.nextLine().split(",");
            packagesList.add(new DeliveryPackage((data[0]), Integer.parseInt(data[1]), Double.parseDouble(data[2]),
                    parser.parse(data[3])));
        }
        scanner.close();
        packagesList.forEach(System.out::println);


        System.out.println("group by location and date");

        Map<Date, Map<String, List<DeliveryPackage>>> groupByLocationAndDate = packagesList.stream().collect(
                Collectors.groupingBy(DeliveryPackage::getDeliveryDate, Collectors.groupingBy(DeliveryPackage::getTargetLocation)));
        //System.out.println(groupByLocationAndDate);
        System.out.println("\n");

        for (Map.Entry<Date, Map<String, List<DeliveryPackage>>> entry : groupByLocationAndDate.entrySet()) {
            System.out.println(entry.getKey() + "\n" + entry.getValue() + "\n");
        }

        int total = 0;

        for (DeliveryPackage p : packagesList) {
            if(p.getTargetLocation().equals(p.getTargetLocation()) &&
                    p.getDeliveryDate().equals(p.getDeliveryDate()))
                total += p.getPackageValue();
            //break;
        }

        System.out.println("Total value of packages is " + total);
    }
}







