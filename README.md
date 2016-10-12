A small project for statistics, dev for a friend.
MVC Structure：
    Model：StatisticBean, store data;
    Controller: StatisticController, handle data;
    View: MyFrame, display data.

Class "FileLoader" is for loading data from file.
Class "StatisticMain" is a center to connect model, controller and view, and the project execution entry, 
"public static void main", is in this class.