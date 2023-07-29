package com.pyw.a08oop.OOPArrTest1;

public class OOPArrTest1 {
    public static void main(String[] args) {
        //TODO 对象数组练习
        /*
         * 定义一数组长度为3，数组存储1~3名学生作为初始数据，学生对象的学号，姓名各不相同，学生属性，学号，姓名，年龄
         *
         * */
        Student[] students = new Student[3];
        students[0] = new Student("1", "pyw", 25);
        students[1] = new Student("2", "yzy", 23);
        students[2] = new Student("3", "zs", 18);


        //校验学号唯一性
//        for (int i = 0; i < students.length; i++) {
//            for (int j = i+1; j < students.length-i; j++) {
//                if(students[i].getId().equals(students[j].getId())){
//                    System.out.println(i+"和"+j+"id不唯一，请重新输入");
//                }
//            }
//        }
        //添加一个学生进行学号唯一性判断
        Student createStudent = new Student("4", "ls", 19);
        boolean idFlag = checkStuId(students, createStudent);

        if (idFlag) {
            System.out.println("请修改id后再添加");
        } else {
            //把createStudent存到数组中，有两种情况



            int countStuArrLenth = countStuArr(students);
            if (countStuArrLenth == students.length) {
                //1、数组已存满 --- 只能创建一个新数组，新数组的长度=老数组+1
                System.out.println("数组已存满 --- 只能创建一个新数组，新数组的长度=老数组+1");
                students = createNewArr(students);
                students[students.length-1] = createStudent;
            } else {
                //2、数组未存满 --- 把数据添加到数组元素中不为空的后一位
                System.out.println("数组未存满 --- 把数据添加到数组元素中不为空的后一位");
                students[countStuArrLenth] = createStudent;
            }
        }
        //添加完毕后遍历所有学生信息
        for (int i = 0; i < students.length; i++) {
            System.out.println("学生信息为：" + students[i].toString());
        }

        //通过id删除
        deleteById("3",students);
        //删除完毕后遍历所有学生信息
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null) {
                System.out.println("学生信息为：" + students[i].toString());
            }
        }

        //查询数组id未“2”的学生，如果存在，则他的年龄+1岁
        String updateId = "2";
        int updateIndex = selectById(updateId,students);
        if(updateIndex!= -1){
            students[updateIndex].setAge(students[updateIndex].getAge()+1);
        }
        System.out.println("更新后的学生信息========");

        //更新完毕后遍历所有学生信息
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null) {
                System.out.println("学生信息为：" + students[i].toString());
            }
        }

    }

    public static void updateById(Student student,Student[] students){
        for (int i = 0; i < students.length; i++) {
            student.getId();
        }
    }

    public static int selectById(String id,Student[] students){
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null) {
                if(students[i].getId().equals(id)){
                    index = i;
                }
            }

        }
        return index;
    }

    public static void deleteById(String id,Student[] students){
        //通过id删除
        int deleteIndex = 0;
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null) {
                if (students[i].getId().equals(id)) {
                    //删除id
                    students[i] = null;
                    deleteIndex = i;
                    flag = true;
                }
            }
        }

        //删除后将所有的位置向前移一位
        if(flag){
            for (int i = deleteIndex; i < students.length - 1; i++) {
                students[i] = students[i+1];
            }
            students[students.length - 1] = null;
        }
    }
    /**
     * 把数组的长度变为新数组的长度
     */
    public static Student[] createNewArr(Student[] students){
        //数组长度+1
        Student[] studentsNew = new Student[students.length + 1];
        //遍历原数组的元素到新数组
        for (int i = 0; i < students.length; i++) {
            studentsNew[i] = students[i];
        }
        return studentsNew;
    }
    /**
     * 检查当前数组的存储个数是多少
     */
    public static int countStuArr(Student[] students) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    /**
     * 检查学生id是否重复
     *
     * @param students
     * @param createStudent
     * @return
     */
    public static boolean checkStuId(Student[] students, Student createStudent) {
        boolean idFlag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                String checkId = students[i].getId();
                if (checkId.equals(createStudent.getId())) {
                    idFlag = true;
                    break;
                }
            }
        }
        return idFlag;
    }
}
