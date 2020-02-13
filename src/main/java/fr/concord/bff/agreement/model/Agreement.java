package fr.concord.bff.agreement.model;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@JsonApiResource(type = "agreements")
public class Agreement {

	@JsonApiId
	private String id;

	@JsonProperty
	private String content;

	public Agreement(final String id, final String content) {
		this.id = id;
		this.content = content;
	}
}
