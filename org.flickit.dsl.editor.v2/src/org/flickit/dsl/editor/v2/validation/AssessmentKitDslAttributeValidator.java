package org.flickit.dsl.editor.v2.validation;

import org.eclipse.xtext.validation.Check;
import org.flickit.dsl.editor.v2.assessmentKitDsl.AssessmentKitDslPackage;
import org.flickit.dsl.editor.v2.assessmentKitDsl.Attribute;

public class AssessmentKitDslAttributeValidator extends AbstractAssessmentKitDslValidator {

	@Check
	public void checkDescriptionNotEmpty(Attribute attribute) {
		if (attribute.getDescription() == null || attribute.getDescription().isBlank())
			error("'Description' may not be empty!",
					AssessmentKitDslPackage.Literals.ATTRIBUTE__DESCRIPTION);
	}
}
