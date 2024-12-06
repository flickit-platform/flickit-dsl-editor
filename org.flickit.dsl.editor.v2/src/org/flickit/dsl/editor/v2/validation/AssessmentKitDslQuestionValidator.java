package org.flickit.dsl.editor.v2.validation;

import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.validation.Check;
import org.flickit.dsl.editor.v2.assessmentKitDsl.AssessmentKitDslPackage;
import org.flickit.dsl.editor.v2.assessmentKitDsl.Question;

public class AssessmentKitDslQuestionValidator extends AbstractAssessmentKitDslValidator {

	@Check
	public void checkHintNotEmpty(Question question) {
		if (question.getHint() != null)
			if (Strings.isEmpty(question.getHint()))
				error("'Hint' may not be empty!", AssessmentKitDslPackage.Literals.QUESTION__HINT);
	}

	@Check
	public void checkQuestionOptionsNumber(Question question) {
		if (question.getOptions() != null && !question.getOptions().isEmpty()) {
			var optionsSize = question.getOptions().size();
			var valuesSize = question.getValues().size();

			if (optionsSize != valuesSize)
				error("Option values size should match the question options size!",
						AssessmentKitDslPackage.Literals.QUESTION__OPTIONS);
		}
	}

	@Check
	public void checkQuestionOptionsOrAnswerRangeExistence(Question question) {
		if ((question.getOptions() == null || question.getOptions().isEmpty()) && question.getAnswerRange() == null)
			error("Question should have options/answerRange but not both!",
					AssessmentKitDslPackage.Literals.QUESTION__OPTIONS);
	}
}
