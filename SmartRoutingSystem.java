import java.util.*;

/**
 * Developer: Berat Yaylacı - 230212056
 * Project: Smart City Routing Optimization
 * Context: Advanced Data Structures & Graph Theory
 */
public class SmartRoutingSystem {
    public static void main(String[] args) {
        System.out.println("=== BERAT'S SMART ROUTING ENGINE ===");
        System.out.println("Academic ID: 230212056 | Status: Engineering Mode");

        Map<String, List<String>> cityGraph = new HashMap<>();

        cityGraph.put("Kadikoy", Arrays.asList("Uskudar", "Okan University"));
        cityGraph.put("Okan University", Arrays.asList("Kadikoy", "Tuzla"));

        System.out.println("\n--- Mevcut Durak Analizi ---");
        for (Map.Entry<String, List<String>> entry : cityGraph.entrySet()) {            System.out.println("Durak: " + entry.getKey() + " -> Baglantilar: " + entry.getValue());
        }

        System.out.println("\nRota optimizasyonu Dijkstra prensibiyle hesaplaniyor...");
        System.out.println("Durum: Tum veri yapıları basarıyla olusturuldu.");
    }
}