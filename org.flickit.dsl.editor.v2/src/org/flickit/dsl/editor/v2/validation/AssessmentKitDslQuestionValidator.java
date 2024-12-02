package org.flickit.dsl.editor.v2.validation;

import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.validation.Check;
import org.flickit.dsl.editor.v2.assessmentKitDsl.AssessmentKitDslPackage;
import org.flickit.dsl.editor.v2.assessmentKitDsl.Question;

public class AssessmentKitDslQuestionValidator extends AbstractAssessmentKitDslValidator {

	@Check
	public void checkHintNotEmpty(Question question) {
		if (question.getHint() != null)
			if (Strings.isEmpty(question.getHint()))
				error("'Hint' may not be empty!",
						AssessmentKitDslPackage.Literals.QUESTION__HINT);
	}
}
