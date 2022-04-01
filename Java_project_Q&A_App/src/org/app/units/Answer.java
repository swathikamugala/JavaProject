package org.app.units;

public class Answer extends AbstractEntity {

    private String answerBody;

    private Question question;

    private User user;

    public int getAnswerBody() {
        return 0;
    }

    public boolean getUser() {
        return false;
    }

    @Override
    public void autoGenerateId() {

    }

    public void setAnswerBody(String answerBody) {
    }

    public void setUser(User user) {
    }

    public boolean getQuestion() {

        return false;
    }
}
