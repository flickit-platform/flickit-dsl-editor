package org.flickit.dsl.editor.v2.validation;

import org.eclipse.xtext.validation.Check;
import org.flickit.dsl.editor.v2.assessmentKitDsl.AssessmentKitDslPackage;
import org.flickit.dsl.editor.v2.assessmentKitDsl.Competence;
import org.flickit.dsl.editor.v2.assessmentKitDsl.CompetenceValue;

public class AssessmentKitDslLevelValidator extends AbstractAssessmentKitDslValidator {

	public static final int COMPETENCE_VALUE_MIN = 0;
	public static final int COMPETENCE_VALUE_MAX = 100;

	@Check
	public void checkCompetenceValueNotOutOfRange(Competence competence) {
		for(CompetenceValue value:competence.getCompetenceValues()) {
			if (value.getValue() < COMPETENCE_VALUE_MIN)
				error(String.format("'Competence value' may not be less than %d!", COMPETENCE_VALUE_MIN),
						AssessmentKitDslPackage.Literals.COMPETENCE__COMPETENCE_VALUES);
	
			if (value.getValue() > COMPETENCE_VALUE_MAX)
				error(String.format("'Competence value' may not be more than %d!", COMPETENCE_VALUE_MAX),
						AssessmentKitDslPackage.Literals.COMPETENCE__COMPETENCE_VALUES);
		}
	}
}
