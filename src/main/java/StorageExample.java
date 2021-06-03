import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

public class StorageExample {
    public static void main(String []args) {
        Storage storage = StorageOptions.getDefaultInstance().getService();
        String bucketName = "anima-frank";
        Bucket bucket = storage.get(bucketName);
    }
}
