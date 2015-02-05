------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
DEPENDENCIES:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:





card:
public boolean equals(Object otherObject)
{
    if (this.getClass() = otherObject.getClass())//same class
    {
        Card other = (Card) otherObject;//cast to Card because is currenly object
        return name.equals(other.name);//returns if instance value is true
    }
    return false;
}

ID Card:

public boolean equals(Object other)
{
    if (this.getClass() = other.getClass())
    {
        IDCard other = (IDCard) otherObject;
        //test other instance variables
        return getName().equals(other.getName()) 
               && idNumber.equals(other.idNumber);
        
    }
    return false;
}

CallingCard:

public boolean equals(Object other)
{
    if (this.getClass() = other.getClass())
    {
        CallingCard other = (CallingCard) otherObject;
        //test other instance variables
        return getName().equals(other.getName()) 
               && pin.equals(other.pin);
        
    }
    return false;
}