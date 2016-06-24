package permission.auron.com.samplemarshmallowpermissionhelper.checkPermission;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import permission.auron.com.marshmallowpermissionhelper.ActivityManagePermission;
import permission.auron.com.marshmallowpermissionhelper.PermissionUtils;
import permission.auron.com.samplemarshmallowpermissionhelper.R;

/**
 * Created by luca on 5/15/16.
 */
public class ActivityCheckPermission extends ActivityManagePermission {

    //    private GoogleApiClient googleApiClient;
    @Override
    @SuppressWarnings({"MissingPermission"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (isPermissionsGranted(ActivityCheckPermission.this, new String[]{PermissionUtils.Manifest_ACCESS_FINE_LOCATION, PermissionUtils.Manifest_ACCESS_COARSE_LOCATION})) {

            //      Location lastLocation = LocationServices.FusedLocationApi.getLastLocation(googleApiClient);


        }
    }
}
