# MarshmallowPermissionManager

[![Platform (Android)](https://img.shields.io/badge/platform-Android-blue.svg?style=flat-square)](http://www.android.com)

Helper to ask runtime permission on android marshmallow


The library takes care themselves to check whether a permit has already been agreed by the user or not.
if the user has given consent call the system dialog for the acceptance

### Import

in build.gradle

```Gradle
allprojects {
    repositories {
        jcenter()
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
# Advance Usage

#### check whether a permit has been agreed

```java
boolean isGranted = isPermissionGranted(MainActivity.this,PermissionUtils.Manifest_WRITE_EXTERNAL_STORAGE);
```
#### PermissionUtils

The permission class utils contains the permissions you need to ask runtime

### Multiple Permissions

```java
         askPermissions(new String[]{PermissionUtils.Manifest_CAMERA, PermissionUtils.Manifest_WRITE_EXTERNAL_STORAGE})
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
in requestPermission() using one key.

# License

The MIT License (MIT)

Copyright (c) 2016 Rurio Luca

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
