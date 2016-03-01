# MarshmallowPermissionManager

[![Platform (Android)](https://img.shields.io/badge/platform-Android-blue.svg?style=flat-square)](http://www.android.com)

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
# Advance Usage




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
