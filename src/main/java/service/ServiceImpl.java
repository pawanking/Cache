package service;

import java.util.HashMap;
import java.util.Map;

public class ServiceImpl implements IService {

	private final Map<String, Object> cacheObjects = new HashMap<String, Object>();
	private Long expiryTime;

    public ServiceImpl(Long timePeriod){
        this.expiryTime = timePeriod;
        this.cleanUpCache();
    }

    /**
     * Method to get the object from the Cached Objects
     * @param key
     * @return
     */
    public Object get(String key) {
        // If difference between insertion time and current time is less than or equal to timePeriod Property
        // i.e CurrentTime - InsertTime <= timePeriod
        // if(Above condition is matched)
        //{
        return cacheObjects.get(key);
        // }
    }

    /**
     * Method to insert object into Cached Objects List
     * @param key
     * @param value
     */
    public void put(String key, Object value) {
        // Before pushing the Object , it is checked whether is already present or not
        // TimeStamp should included in Object value i.e. Insertion Time
        // Only if above cases are matches , Object is added to the Map Collection
        if(!cacheObjects.containsKey(key)){
            cacheObjects.put(key, value);
        }
    }

    /**
     * This method's purpose is to remove the objects from the CacheObjects List
     * if timePeriod is greater than  difference between insertion time and current time
     */
    private void cleanUpCache(){

    }
}
