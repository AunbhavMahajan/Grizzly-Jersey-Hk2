package main.java.config.resources;

import org.jvnet.hk2.annotations.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

@Service
public class ResourceMapper {

    private HashMap<String, String> endpointToResourceMap;
    private final File file = new File("src/main/resources/endpoint_to_resource_map.txt");

    public ResourceMapper() {
        System.out.println("Inside ResourceMapper constructor");
        endpointToResourceMap = initMap();
    }

    public HashMap<String, String> initMap () {
        HashMap<String, String> endpointToResourceMap = new HashMap<>();
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null) {
                String[] split = line.split(":");
                endpointToResourceMap.put(split[0], split[1]);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        return endpointToResourceMap;
    }

    public String getResourceManager(String endpoint) {
        return endpointToResourceMap.get(endpoint);
    }
}
