package net.asktheworld.asktheworld.repositories;

import net.asktheworld.asktheworld.model.Question;

import java.util.ArrayList;

/**
 * Created by magraf on 23.10.2017.
 */

public class QuestionRepository {

    private static QuestionRepository instance;

    private QuestionRepository() {}

    public static QuestionRepository getInstance() {
        if(self.instance == null) {
            self.instance = new QuestionRepository();
        }
        return self.instance;
    }

    public ArrayList<Question> getAllOpenQuestions() {
        return new ArrayList<Question>();
    }

}
