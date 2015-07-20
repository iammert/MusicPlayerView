# MusicPlayerView
[![Join the chat at https://gitter.im/iammert/MusicPlayerView](https://img.shields.io/badge/GITTER-join%20chat-green.svg)](https://gitter.im/iammert/MusicPlayerView) [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-MusicPlayerView-green.svg?style=flat)](https://android-arsenal.com/details/1/2167)

Android custom view and progress for music player.

# Screen 
<img src="https://raw.githubusercontent.com/iammert/MusicPlayerView/master/art/art.gif"/>

# Usage 

You can define values on you XML file or you can make it programmatically. We have 5 values to customize
our player view.


```java
mpv = (MusicPlayerView) findViewById(R.id.mpv);
```  

```buttonColor```  play/pause button background.
```progressEmptyColor``` progress bar color(Left Seconds)
```progressLoadedColor``` progress bar color(Passed Seconds)
```textColor``` music minutes(Left and passed time) color
```textSize``` music minutes(Left and passed time) size

## XML Usage

```xml
<co.mobiwise.library.MusicPlayerView
        android:id="@+id/mpv"
        android:layout_width="250dp"
        android:layout_height="250dp"
        app:textSize = "14sp"
        app:textColor = "#80FFFFFF"
        app:buttonColor = "#FF0028"
        app:progressLoadedColor = "#00815E"
        app:progressEmptyColor = "#20FFFFFF"
        app:cover = "@drawable/mycover"/>
```
        
## Java Usage

You can customize UI view programmatically
```java
mpv.setButtonColor(Color.DKGRAY);
mpv.setCoverDrawable(R.drawable.mycover);
mpv.setProgressEmptyColor(Color.GRAY);
mpv.setProgressLoadedColor(Color.BLUE);
mpv.setTimeColor(Color.WHITE);
```

##  Methods

You can also load image from URL
```java
mpv.setCoverURL("YOUR_IMAGE_URL");
```

You need to set music time in seconds otherwise default value 100 seconds will be used.
```java
mpv.setMax(320);
```

Progress will start from 0. But you can also set progress.
```java
mpv.setProgress(10);
```

To start playing
```java
mpv.start();
```

To stop playing
```java
mpv.stop();
```

Check if it is rotating(Playing)
```java
mpv.isRotating();
```

When you call ```start()``` method, image will start rotating and progress(seconds) will start counting 
automatically. when you call ```stop()``` method, rotating will be stopped, time too. You may want to handle
progress yourself. You can disable progress thread.
```java
mpv.setAutoProgress(false);
```

You can also change velocity of turning album cover.(Default value is 1 which is ideal -my idea-)
```java
mpv.setVelocity(2);
```

# Download
You can download .aar library from [here](https://github.com/iammert/MusicPlayerView/blob/master/library-release.aar)

It will be available on maven repo soon.

# Libraries Used

[Picasso by Square](http://square.github.io/picasso/)

# Design Owner

[Design](https://dribbble.com/shots/2133878-Music-animations-part4-share?list=users&offset=12?list=users) is created by [Xiang lili] (https://twitter.com/xiang_lili) 

License
--------


    Copyright 2015 Mert Şimşek.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.



