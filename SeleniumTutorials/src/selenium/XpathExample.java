package selenium;

public class XpathExample {
	
   //Xpath types -> i, Absolute. ii, Relative.
	
   //i, Absolute -> It will start from root node. It have single /.
   //ii, Relative -> It will start from the current node. It have double //.
	
   //<input -> Element. name -> Attribute. "username" -> value.
	
   //Locating with respect to "Element" & "Attributes".
   //1,Locating Elements with known "Attribute".
   //Syntax -> //*[@attribute='value']
	
   //2,Locating Elements with known "Element & Attributes".
   //Syntax -> //element[@attribute='value']
	
   //3,Locating Elements with known visible "Text".
   //Syntax -> //element[text()='exact text'] or //*[text()='exact text']
	
   //4,Locating Elements when part of the visible text is known "(Partial match)".
   //Syntax -> //element[contains(text(),'part of the text')] or //*[contains(text(),'part of the text')]
	
   //5,Locating Elements with "Multiple Attributes".
   //Syntax -> //*[attribute1='value1'][attribute2='value2']...[attributeN='valueN']
	
   //6,Locating Elements when "starting visible text" is known.
   //Syntax -> //*[starts-with(text(),'starting text')]
	
   //7,Locating Elements with "Dynamic Attribute values".
   //Syntax -> //element[contains(@attribute, 'part of the value')] or //element[starts-with(@attribute, 'fixed prefix of the value')]
	
   
   
   //Xpath axes: i,Parent. ii,Child. iii,Ancestor. iv,following. v,preceding. vi,following-sibling. vii,preceding-sibling.
	
   //Locating elements relative to known element.
   //1,Locating a "parent element".
   //Syntax -> //<knownXpath>/parent::<element>
   
	//2,Locating a "child element".
	//Syntax -> //<knownXpath>/child::<element>
	
	//3,Locating "ancestor(grand father) of a known element".
	//Syntax -> //<knownXpath>/ancestor::<element>
	
	//4,Locating "following elements".
	//Syntax -> //<knownXpath>/following::<element> or //<knownXpath>/following::<element>[position]
	
	//5,Locating "preceding(before) element".
	//Syntax -> //<knownXpath>/preceding::<element>
	
	//6,Locating "following sibling" -> Same HTML hierarchy.
	//Syntax -> //<knownXpath>/following-sibling::<element>
	
	//7,Locating "preceding sibling".
	//Syntax -> //<knownXpath>/preceding-sibling::<element>
	
   public static void main(String[] args) {
		
	}

}
