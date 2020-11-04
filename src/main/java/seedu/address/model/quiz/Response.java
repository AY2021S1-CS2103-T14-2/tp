package seedu.address.model.quiz;


import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import seedu.address.model.quiz.exceptions.InvalidQuestionAnswerException;

/**
 * Represents a response to a question in a quiz.
 */
public class Response {
    private String response;
    private Question question;
    private boolean isCorrect = false;

    /**
     * Every field must be present and not null.
     */
    public Response(String response, Question question) {
        requireAllNonNull(response, question);
        this.response = response;
        this.question = question;
    }

    /**
     * Every field must be present and not null.
     */
    public Response(String response, Question question, boolean isCorrect) {
        requireAllNonNull(response, question, isCorrect);
        this.response = response;
        this.question = question;
        this.isCorrect = isCorrect;
    }

    /**
     * Executes the command and returns the result.
     * @throws InvalidQuestionAnswerException if the response is not valid.
     */
    public void markResponse() throws InvalidQuestionAnswerException {
        this.isCorrect = question.checkResponse(response);
    }

    public boolean getIsCorrect() {
        return this.isCorrect;
    }

    public Question getQuestion() {
        return this.question;
    }

    public String getResponse() {
        return this.response;
    }

}
