package org.flickit.dsl.editor.v2.validation;

import org.eclipse.xtext.validation.Check;
import org.flickit.dsl.editor.v2.assessmentKitDsl.AssessmentKitDslPackage;
import org.flickit.dsl.editor.v2.assessmentKitDsl.Questionnaire;

public class AssessmentKitDslQuestionnaireValidator extends AbstractAssessmentKitDslValidator {

	@Check
	public void checkDescriptionNotEmpty(Questionnaire questionnaire) {
		if (questionnaire.getDescription() == null || questionnaire.getDescription().isBlank())
			error("'Description' may not be empty!",
					AssessmentKitDslPackage.Literals.QUESTIONNAIRE__DESCRIPTION);
	}
}
