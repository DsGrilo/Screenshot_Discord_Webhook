package storage;

import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

import java.nio.file.Path;

public class StorageCloud {
    Storage storage = StorageOptions.getDefaultInstance().getService();

    // THIS SAVE STORAGE IS FOR A PUBLIC BUCKET - NEED TO CHANGE TO PRIVATE BUCKET
    // ADD A SERVICE ACCOUNT TO THE PROJECT AND GIVE IT PERMISSION TO THE BUCKET
    public String save(byte[] imageBytes, String directory){
        String bucketName = "YOUR_BUCKET_NAME";
        var blobId = BlobId.of(bucketName, directory);
        var blobInfo = BlobInfo.newBuilder(blobId).setContentType("image/png").build();
        Blob blob = storage.create(blobInfo, imageBytes);
        return blob.getMediaLink();
    }

}

