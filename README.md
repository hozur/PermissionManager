# MarshmallowPermissionManager

Helper to ask runtime permission on android marshmallow

### Import

```Gradle
repositories {
    maven {
        url 'https://dl.bintray.com/auron/maven'
    }
}

```
```Gradle
dependencies {
 compile 'com.auron:permission-manage:1.0.1'
}
```

### How to use

#### Activity

Activity extends ActivityManagePermission

```java

public class MainActivity extends ActivityManagePermission {

}
```

sample usage to ask camera permission

```java
 askPermission(PermissionUtils.Manifest_CAMERA)
                        .setPermissionResult(new PermissionResult() {
                            @Override
                            public void permissionGranted() {
                                //permission granted
                                //replace with your action
                            }

                            @Override
                            public void permissionNotGranted() {
                                //permission denied
                                //replace with your action
                            }
                        })
                        .requestPermission(PermissionUtils.KEY_CAMERA);
```

#### Fragment

FragmentHome extends FragmentManagePermission

```java

public class FragmentHome extends FragmentManagePermission {

}
```

sample usage to ask camera permission

```java
 askPermission(PermissionUtils.Manifest_CAMERA)
                        .setPermissionResult(new PermissionResult() {
                            @Override
                            public void permissionGranted() {
                                //permission granted
                                //replace with your action
                            }

                            @Override
                            public void permissionNotGranted() {
                                //permission denied
                                //replace with your action
                            }
                        })
                        .requestPermission(PermissionUtils.KEY_CAMERA);
```
