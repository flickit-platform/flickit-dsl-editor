package org.flickit.dsl.editor.v2.validation;

import org.eclipse.xtext.validation.Check;
import org.flickit.dsl.editor.v2.assessmentKitDsl.AssessmentKitDslPackage;
import org.flickit.dsl.editor.v2.assessmentKitDsl.Subject;

public class AssessmentKitDslSubjectValidator extends AbstractAssessmentKitDslValidator {

	@Check
	public void checkDescriptionNotEmpty(Subject subject) {
		if (subject.getDescription() == null || subject.getDescription().isBlank())
			error("'Description' may not be empty!",
					AssessmentKitDslPackage.Literals.SUBJECT__DESCRIPTION);
	}
}
