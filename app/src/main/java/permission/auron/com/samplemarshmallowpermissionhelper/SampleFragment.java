package permission.auron.com.samplemarshmallowpermissionhelper;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import permission.auron.com.marshmallowpermissionhelper.FragmentManagePermission;
import permission.auron.com.marshmallowpermissionhelper.PermissionResult;
import permission.auron.com.marshmallowpermissionhelper.PermissionUtils;

public class SampleFragment extends FragmentManagePermission {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        askCompactPermission(PermissionUtils.Manifest_CAMERA, new PermissionResult() {
            @Override
            public void permissionGranted() {
                //permission granted
                //replace with your action

            }

            @Override
            public void permissionDenied() {
                Log.d("SecondActivity", "denied");
                //permission denied
                //replace with your action
            }

            @Override
            public void permissionForeverDienid() {

            }
        });
    }

    private void sampleAskMultiplePermission() {


        askCompactPermissions(new String[]{PermissionUtils.Manifest_CAMERA, PermissionUtils.Manifest_WRITE_EXTERNAL_STORAGE}, new PermissionResult() {
            @Override
            public void permissionGranted() {
                //permission granted
                //replace with your action

            }

            @Override
            public void permissionDenied() {
                Log.d("SecondActivity", "denied");
                //permission denied
                //replace with your action
            }

            @Override
            public void permissionForeverDienid() {

            }
        });

    }
}
