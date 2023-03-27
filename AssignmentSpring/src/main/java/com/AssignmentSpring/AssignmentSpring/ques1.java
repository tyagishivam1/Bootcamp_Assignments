package com.AssignmentSpring.AssignmentSpring;
class Box
{
    public int volume;
    Box(int length, int width, int height)
    {
        this.volume = length * width * height;
    }
}
class ques1
{
    public static void main(String args[])
    {
        Box b = new Box(5,5,5);
        System.out.println(b.volume);
    }
}

