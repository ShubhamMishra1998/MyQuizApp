package com.epam.quiz.management.view.question;

import com.epam.quiz.management.model.Question;

public enum UpdateOperation {
    UPDATEPROBLEMSTATEMENT{
        boolean match(String condition){
            return condition.equals("UPDATEPROBLEMSTATEMENT");
        }

        public void update(Question q, String info){
           q.setProblemStatement(info);
        }
    },

    UPDATEOPTION1{
        boolean match(String condition){
            return condition.equals("UPDATEOPTION1");
        }

        public void update(Question q, String info){
            q.setOp1(info);
        }
    },

    UPDATEOPTION2{
        boolean match(String condition){
            return condition.equals("UPDATEOPTION2");
        }

        public void update(Question q, String info){
            q.setOp2(info);
        }
    },

    UPDATEOPTION3{

        boolean match(String condition){
            return condition.equals("UPDATEOPTION3");
        }

        public void update(Question q, String info){
            q.setOp3(info);
        }

    },

    UPDATEOPTION4{

        boolean match(String condition){
            return condition.equals("UPDATEOPTION4");
        }

        public void update(Question q, String info){
            q.setOp4(info);
        }

    },

    UPDATEANS{
        boolean match(String condition){
            return condition.equals("UPDATEANS");
        }

        public void update(Question q, String info){
           q.setAns(info);
        }
    };


    public static UpdateOperation updateOperation(String cond){
        for(UpdateOperation o:values()){
            if(o.match(cond)){
                return o;
            }
        }
        return null;
    }


     abstract boolean match(String condition);
    public abstract void update(Question q, String info);

}
