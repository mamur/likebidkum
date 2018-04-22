
package com.jasakreatif.bidkum.library.asset;

public interface CopyAsset {
    void copy(String assetName, String destinationPath);

    interface Listener {
        void success(String assetName, String destinationPath);

        void failure(Exception e);
    }
}
