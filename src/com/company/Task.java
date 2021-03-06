package com.company;

class Task implements Comparable<Task>{
    String taskTitle;
    int priority;
    String desc;

    public Task(String taskTitle, int priority, String desc) {
        this.taskTitle = taskTitle;
        this.priority = priority;
        this.desc = desc;

        if (this.priority<0){
            this.priority=0;
        }else if (this.priority>5){
            this.priority=5;
        }

    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    @Override
    public int compareTo(Task o) {
        if (this.priority > o.priority){
            return 1;
        }
        else if (this.priority < o.priority){
            return -1;
        }
        else{
            if(this.taskTitle.compareTo(o.taskTitle) > 0){
                return 1;
            }
            else if(this.taskTitle.compareTo(o.taskTitle) < 0){
                return -1;
            }
            else{
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Title: " + taskTitle + " Priority: " + priority + " Task: " + desc;
    }
}
