package org.familysearch.ct.ws.rs.binding;

import org.gedcomx.conclusion.Conclusion;
import org.gedcomx.conclusion.rs.definition.ConclusionRSDefinition;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * @author Randy Bliss
 */
public interface ConclusionRSBinding extends ConclusionRSDefinition {

  @GET
  @Override
  Conclusion readConclusion(@Context UriInfo uriInfo);

  @PUT
  @Override
  void updateConclusion(@Context UriInfo uriInfo, Conclusion conclusion);

  @DELETE
  @Override
  void deleteConclusion(@Context UriInfo uriInfo);
}
