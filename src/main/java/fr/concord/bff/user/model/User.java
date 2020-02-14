package fr.concord.bff.user.model;

import fr.concord.bff.agreement.model.Agreement;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@JsonApiResource(type = "users")
public class User {

	@JsonApiId
	private String id;

	@JsonProperty
	private String name;

	@JsonApiRelation(mappedBy = "users")
	private Set<Agreement> agreements;

	public User(final String id,
	            final String name) {
		this.id = id;
		this.name = name;
	}
}
