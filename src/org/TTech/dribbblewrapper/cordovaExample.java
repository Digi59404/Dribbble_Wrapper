/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package org.TTech.dribbblewrapper;

import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.*;

public class cordovaExample extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.setIntegerProperty("splashscreen", R.drawable.splash); // Displays the splash screen for android
        super.loadUrl("file:///android_asset/www/index.html");
        //super.loadUrl("javascript:window.onload=function() {div = document.getElementById('header');div.style.position = 'fixed';div.style.width='100%';div.style.zIndex='100';div1 = document.getElementById('wrap');div1.style.paddingTop = '67px';div1.style.zIndex='1'}");
        //super.loadUrl("javascript:var script=document.createElement('script');script.type='text/javascript';script.src='http://debug.phonegap.com/target/target-script-min.js#dribble_wrap';document.getElementsByTagName('head').item(0).appendChild(script);");
    }

}

