## AdobeRGB-Renamer
**Removes underscore and corrects filenames, preserving their originality.**

* _DSC1080 &#10132; DSC1080
* _MG1502 &#10132; IMG1502
* _DSF0982 &#10132; DSCF0982

<br>

## Download
* Download the latest release [here](https://bit.ly/imspeed-releases)  
  
<br>
  
## Add To context menu (.exe)

* start regedit
* navigate to: `Computer\HKEY_CLASSES_ROOT\Directory\shell\`
* rightclick on shell & create new key (its name will be displayed in the context menu)
* rightclick on your new key & create new key, name it `"command"`
* set the `"Default"` value to program path and add "%1" after space

	> for example: `"C:\Desktop\AdobeRGB.exe" "%1"`
<br>

* **Adding icon (optional):**
	* rightclick on your parent key & create new string value, name it "icon"
	* set its value to program path
		> for example: `"C:\Desktop\AdobeRGB.exe"`
<br>
 
- ### **Currently supported camera brands (RAW/JPG):** 
	- Canon  
	- Nikon  
	- Sony  
	- Fujifilm 
<br>

* Feel free to request new brand support, just provide both, sRGB and AdobeRGB files.
