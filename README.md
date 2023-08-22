# Android Application for Traffic Sign Recognition (APTSR/Road Assistant)


<img src="https://github.com/VirgileDjimgou/Android-Application-for-Traffic-Sign-Recognition/blob/master/Doc/Record_gif.gif" width="255" height="540">


Motivation

In 2020,the european commission publishes this statistic : <<  About 30% of road fatalities are caused by excessive or inappropriate speed. published main causes for driver errors in road traffic accidents with personal injury >> . On the other side of the Atlantic; the same situation can be observed in North America,in particular in the United State where 26% of all motor vehicle-related fatalities occurred in speed-related crashes.

![Alt text](roadTrafficFatalities.PNG)

In recent decades, new driving aid tools have been introduced on most recent vehicles. which had the effect of significantly reducing the statistics related to inattention in a driving situation.however, these new tools cannot be integrated into older generation cars. hence the idea of developing this Android AI application and integrating new advances in artificial intelligence and real-time image analysis. An affordable AI-based solution with an attractive user interface for automated speed limit and could provide real-time information about any currently valid limit to drivers of any car type, increasing security on the road significantly.


What is Android Applicationfor Traffic Sign Recognition (APTSR) ? 

APTSR is an advanced driver assistance system (ADAS) that recognizes and relays traffic sign information to drivers via the smartphone screen or instrument panel. APTSR systems can recognize speed limit signs, do not enter signs, and stop signs ...etc. APTSR aims to help make drivers more aware and able to make better safer driving decisions.  

Implementation

On this project data was extracted from German Traffic Sign Dataset.More precisely the GTSDB (https://benchmark.ini.rub.de/?section=gtsdb&subsection=dataset), was used for traffic sign recognition on images with background environment and various light conditions and the GTSRB, was used on training traffic sign classes from cropped road sign images.

This project is using Deep Learning (transfer learning) method and Tensorflow Lite, through retraining pretrained MobilenetV1 MobilenetV1,MobilenetV2,InceptionV2 models from google.

How does APTSR work ? 

Android Traffic Sign Recognition uses advanced forward-facing cameras of Android Smartphone, generally mounted to the windshield, near the rear-view mirror. The smartphone camera handles road sign detection, and software processes them to classify what certain traffic signs mean. 

![Alt text](Screenshot_2023-08-22-02-51-07-09_7c812a5677f73e9833a2910b939c9785.jpg) ![Alt text](Screenshot_2023-08-22-02-50-56-65_7c812a5677f73e9833a2910b939c9785.jpg)

![Alt text](Screenshot_2023-08-22-02-51-31-01_7c812a5677f73e9833a2910b939c9785.jpg) ![Alt text](Screenshot_2023-08-22-02-52-01-92_7c812a5677f73e9833a2910b939c9785.jpg) ![Alt text](Screenshot_2023-08-22-02-54-16-63_7c812a5677f73e9833a2910b939c9785.jpg) ![Alt text](Screenshot_2023-08-22-02-54-23-11_7c812a5677f73e9833a2910b939c9785.jpg) ![Alt text](Screenshot_2023-08-22-02-54-54-83_7c812a5677f73e9833a2910b939c9785.jpg) ![Alt text](Screenshot_2023-08-22-02-55-02-13_7c812a5677f73e9833a2910b939c9785.jpg)

Important notice:
Please note that the performance of Android Application for Traffic Sign recognition depends on several factors, such as light and weather conditions, cleanliness of the windshield, phone placement, etc.
APTSR is a camera-based feature, and its usage is highly demanding for a phone’s operation.therefore, this application may not work optimally on Smartphones that do not have sufficient computing power or older generation phones

 Who made this
--------------

| <a href="https://github.com/VirgileDjimgou"><img src="https://avatars1.githubusercontent.com/u/8148300?s=400&v=4" alt="IoEngine" align="left" height="100" width="100" /></a>
|---
| [VirgileDjimgou](https://github.com/VirgileDjimgou)



Contribute
----------

1. Create an issue to discuss about your idea
2. [Fork it] (https://github.com/VirgileDjimgou/Android-Application-for-Traffic-Sign-Recognition.git)
3. Create your feature branch (`git checkout -b my-new-feature`)
4. Commit your changes (`git commit -am 'Add some feature'`)
5. Push to the branch (`git push origin my-new-feature`)
6. Create a new Pull Request
7. Profit! :white_check_mark:
