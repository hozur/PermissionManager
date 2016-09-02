package permission.auron.com.samplemarshmallowpermissionhelper.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import permission.auron.com.marshmallowpermissionhelper.FragmentManagePermission;
import permission.auron.com.marshmallowpermissionhelper.PermissionResult;
import permission.auron.com.marshmallowpermissionhelper.PermissionUtils;
import permission.auron.com.samplemarshmallowpermissionhelper.R;

public class FragmentSinglePermission extends FragmentManagePermission {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);


        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        askCompactPermission(PermissionUtils.Manifest_GROUP_CONTACTS, new PermissionResult() {
            @Override
            public void permissionGranted() {
                //permission granted
                //replace with your action


            }

            @Override
            public void permissionDenied() {
                Log.d(FragmentSinglePermission.class.getSimpleName(), "denied");
                //permission denied
                //replace with your action
            }

            @Override
            public void permissionForeverDenied() {

            }
        });
    }

    private void sampleAskMultiplePermission() {


        askCompactPermissions(new String[]{PermissionUtils.Manifest_READ_CONTACTS, PermissionUtils.Manifest_WRITE_CONTACTS}, new PermissionResult() {
            @Override
            public void permissionGranted() {
                //permission granted
                //replace with your action

            }

            @Override
            public void permissionDenied() {
                Log.d(FragmentSinglePermission.class.getSimpleName(), "denied");
                //permission denied
                //replace with your action
            }

            @Override
            public void permissionForeverDenied() {

            }
        });

    }


}
