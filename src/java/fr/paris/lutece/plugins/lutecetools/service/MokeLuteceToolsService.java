/*
 * Copyright (c) 2002-2018, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.lutecetools.service;

import fr.paris.lutece.plugins.lutecetools.business.Component;
import fr.paris.lutece.plugins.lutecetools.business.dto.SiteBuilderConfDto;
import java.util.ArrayList;
import java.util.List;

public class MokeLuteceToolsService extends AbstractLuteceToolsService
{

    /**
     * {@inheritDoc}
     */
    @Override
    public String getJSONArtifactIdList( )
    {
        return "{\"components\":[{\"artifact_id\":\"lutece-core\"}," + "{\"artifact_id\":\"gru-module-grusupply-database\"},"
                + "{\"artifact_id\":\"gru-module-grusupply-elastic\"}," + "{\"artifact_id\":\"gru-plugin-grusupply\"},"
                + "{\"artifact_id\":\"library-actes\"}," + "{\"artifact_id\":\"library-address\"}," + "{\"artifact_id\":\"library-analyzer\"},"
                + "{\"artifact_id\":\"library-apimanager-client\"}," + "{\"artifact_id\":\"library-archive\"}," + "{\"artifact_id\":\"library-blobstore\"},"
                + "{\"artifact_id\":\"library-cotationdls\"}," + "{\"artifact_id\":\"library-crmclient\"}," + "{\"artifact_id\":\"library-datastore\"},"
                + "{\"artifact_id\":\"library-depot-pj-SIEL\"}," + "{\"artifact_id\":\"library-doc-converter\"},"
                + "{\"artifact_id\":\"library-documentclient\"}," + "{\"artifact_id\":\"library-elastic\"}," + "{\"artifact_id\":\"library-embosseuse\"},"
                + "{\"artifact_id\":\"library-formxml\"}," + "{\"artifact_id\":\"library-freemarker\"}," + "{\"artifact_id\":\"library-grubusiness\"},"
                + "{\"artifact_id\":\"library-guice\"}," + "{\"artifact_id\":\"library-httpaccess\"}," + "{\"artifact_id\":\"library-identitystore\"},"
                + "{\"artifact_id\":\"library-image\"}," + "{\"artifact_id\":\"library-indexer\"}," + "{\"artifact_id\":\"library-insee\"},"
                + "{\"artifact_id\":\"library-interfacenuu\"}," + "{\"artifact_id\":\"library-intraparis-cachekey\"},"
                + "{\"artifact_id\":\"library-intraparis-casuserkey\"}," + "{\"artifact_id\":\"library-jmx-api\"}," + "{\"artifact_id\":\"library-journal\"},"
                + "{\"artifact_id\":\"library-jsr286-pluto\"}," + "{\"artifact_id\":\"library-keydiversification\"},"
                + "{\"artifact_id\":\"library-logement-userattributes\"}," + "{\"artifact_id\":\"library-lucene\"},"
                + "{\"artifact_id\":\"library-lutece-unit-testing\"}," + "{\"artifact_id\":\"library-mvc\"}," + "{\"artifact_id\":\"library-notifygru\"},"
                + "{\"artifact_id\":\"library-pasu\"}," + "{\"artifact_id\":\"library-providercustomer\"}," + "{\"artifact_id\":\"library-rbac-api\"},"
                + "{\"artifact_id\":\"library-rss\"}," + "{\"artifact_id\":\"library-signrequest\"}," + "{\"artifact_id\":\"library-sima\"},"
                + "{\"artifact_id\":\"library-sira\"}," + "{\"artifact_id\":\"library-spagobiclient\"}," + "{\"artifact_id\":\"library-stock\"},"
                + "{\"artifact_id\":\"library-unit-testing\"}," + "{\"artifact_id\":\"library-updater\"}," + "{\"artifact_id\":\"library-updatercli\"},"
                + "{\"artifact_id\":\"library-updaterlci\"}," + "{\"artifact_id\":\"library-workflow-core\"},"
                + "{\"artifact_id\":\"library-workflow-notify\"}," + "{\"artifact_id\":\"library-workgroup-api\"},"
                + "{\"artifact_id\":\"module-actes-fast\"}," + "{\"artifact_id\":\"module-actes-s2low\"},"
                + "{\"artifact_id\":\"module-address-autocomplete\"}," + "{\"artifact_id\":\"module-advert-solr\"},"
                + "{\"artifact_id\":\"module-announce-mydashboard\"}," + "{\"artifact_id\":\"module-announce-solr\"},"
                + "{\"artifact_id\":\"module-announce-workflow\"}," + "{\"artifact_id\":\"module-aot-declarationimmat\"},"
                + "{\"artifact_id\":\"module-appcenter-appcode\"}," + "{\"artifact_id\":\"module-appcenter-environment\"},"
                + "{\"artifact_id\":\"module-appcenter-fastdeployapplication\"}," + "{\"artifact_id\":\"module-appcenter-guichetpro\"},"
                + "{\"artifact_id\":\"module-appcenter-identitystore\"}," + "{\"artifact_id\":\"module-appcenter-jobs\"},"
                + "{\"artifact_id\":\"module-appcenter-moncomptesettings\"}," + "{\"artifact_id\":\"module-appcenter-notifygru\"},"
                + "{\"artifact_id\":\"module-appcenter-openam\"}," + "{\"artifact_id\":\"module-appcenter-sources\"},"
                + "{\"artifact_id\":\"module-appcenter-support\"}," + "{\"artifact_id\":\"module-appcenter-wsso\"},"
                + "{\"artifact_id\":\"module-appointment-alert\"}," + "{\"artifact_id\":\"module-appointment-filling-aapkf\"},"
                + "{\"artifact_id\":\"module-appointment-filling\"}," + "{\"artifact_id\":\"module-appointment-leaflet\"},"
                + "{\"artifact_id\":\"module-appointment-mydashboard\"}," + "{\"artifact_id\":\"module-appointment-resource\"},"
                + "{\"artifact_id\":\"module-appointment-solr\"}," + "{\"artifact_id\":\"module-appointment-solrsearchapp\"},"
                + "{\"artifact_id\":\"module-appointmentgru\"}," + "{\"artifact_id\":\"module-appt-alert\"}," + "{\"artifact_id\":\"module-arbres-rest\"},"
                + "{\"artifact_id\":\"module-archive-rest\"}," + "{\"artifact_id\":\"module-are-eudonet\"},"
                + "{\"artifact_id\":\"module-billetterie-mydashboard\"}," + "{\"artifact_id\":\"module-blobstore-alpaca\"},"
                + "{\"artifact_id\":\"module-blobstore-delib\"}," + "{\"artifact_id\":\"module-blobstore-rest\"}," + "{\"artifact_id\":\"module-blog-solr\"},"
                + "{\"artifact_id\":\"module-calendar-document\"}," + "{\"artifact_id\":\"module-calendar-solr\"},"
                + "{\"artifact_id\":\"module-captcha-jcaptcha\"}," + "{\"artifact_id\":\"module-captcha-recaptcha\"},"
                + "{\"artifact_id\":\"module-chatbot-stationnement\"}," + "{\"artifact_id\":\"module-comarquage-solr\"},"
                + "{\"artifact_id\":\"module-crm-favorites\"}," + "{\"artifact_id\":\"module-crm-form\"}," + "{\"artifact_id\":\"module-crm-formengine\"},"
                + "{\"artifact_id\":\"module-crm-mydashboard-favorites\"}," + "{\"artifact_id\":\"module-crm-mydashboard\"},"
                + "{\"artifact_id\":\"module-crm-mylutece\"}," + "{\"artifact_id\":\"module-crm-mylutecedatabase\"},"
                + "{\"artifact_id\":\"module-crm-mylutecedirectory\"}," + "{\"artifact_id\":\"module-crm-rest\"},"
                + "{\"artifact_id\":\"module-customerprovisioning-identitystore\"}," + "{\"artifact_id\":\"module-customerprovisioning-mylutecedatabase\"},"
                + "{\"artifact_id\":\"module-customerprovisioning-openam\"}," + "{\"artifact_id\":\"module-dansmarue-ramen\"},"
                + "{\"artifact_id\":\"module-dansmarue-rest\"}," + "{\"artifact_id\":\"module-dbpage-jasper\"},"
                + "{\"artifact_id\":\"module-declarationimmat-interfaceaot\"}," + "{\"artifact_id\":\"module-declarationimmat-interfacesgtv\"},"
                + "{\"artifact_id\":\"module-digglike-jasper\"}," + "{\"artifact_id\":\"module-digglike-solr\"}," + "{\"artifact_id\":\"module-dila-solr\"},"
                + "{\"artifact_id\":\"module-directory-address\"}," + "{\"artifact_id\":\"module-directory-archivejury\"},"
                + "{\"artifact_id\":\"module-directory-exportfile\"}," + "{\"artifact_id\":\"module-directory-gis\"},"
                + "{\"artifact_id\":\"module-directory-gismap\"}," + "{\"artifact_id\":\"module-directory-googlemaps\"},"
                + "{\"artifact_id\":\"module-directory-mappingmanager\"}," + "{\"artifact_id\":\"module-directory-multiview\"},"
                + "{\"artifact_id\":\"module-directory-multiviewgra\"}," + "{\"artifact_id\":\"module-directory-pdfproducer-archive\"},"
                + "{\"artifact_id\":\"module-directory-pdfproducer\"}," + "{\"artifact_id\":\"module-directory-rest\"},"
                + "{\"artifact_id\":\"module-directory-restlet\"}," + "{\"artifact_id\":\"module-directory-solr\"},"
                + "{\"artifact_id\":\"module-document-ckan\"}," + "{\"artifact_id\":\"module-document-cmis\"},"
                + "{\"artifact_id\":\"module-document-export\"}," + "{\"artifact_id\":\"module-document-geoloc\"},"
                + "{\"artifact_id\":\"module-document-gismap\"}," + "{\"artifact_id\":\"module-document-import\"},"
                + "{\"artifact_id\":\"module-document-include-opengraph\"}," + "{\"artifact_id\":\"module-document-multirootindexers\"},"
                + "{\"artifact_id\":\"module-document-rest\"}," + "{\"artifact_id\":\"module-document-solr\"},"
                + "{\"artifact_id\":\"module-documenttocalendar\"}," + "{\"artifact_id\":\"module-easyrulesbot-ldap\"},"
                + "{\"artifact_id\":\"module-easyrulesbot-sitebuilder\"}," + "{\"artifact_id\":\"module-easyrulesbot-ticketing\"},"
                + "{\"artifact_id\":\"module-elasticdata-appointment\"}," + "{\"artifact_id\":\"module-elasticdata-bp\"},"
                + "{\"artifact_id\":\"module-elasticdata-dansmarue\"}," + "{\"artifact_id\":\"module-elasticdata-gru\"},"
                + "{\"artifact_id\":\"module-elasticsearch-head\"}," + "{\"artifact_id\":\"module-elasticsearch-statsfilter\"},"
                + "{\"artifact_id\":\"module-extend-actionbar\"}," + "{\"artifact_id\":\"module-extend-actionhit\"},"
                + "{\"artifact_id\":\"module-extend-comment-extendable\"}," + "{\"artifact_id\":\"module-extend-comment-rating\"},"
                + "{\"artifact_id\":\"module-extend-comment\"}," + "{\"artifact_id\":\"module-extend-favorite\"},"
                + "{\"artifact_id\":\"module-extend-feedback\"}," + "{\"artifact_id\":\"module-extend-follow\"},"
                + "{\"artifact_id\":\"module-extend-opengraph\"}," + "{\"artifact_id\":\"module-extend-rating\"},"
                + "{\"artifact_id\":\"module-extend-statistics\"}," + "{\"artifact_id\":\"module-fdw-wizard-exportdirectory\"},"
                + "{\"artifact_id\":\"module-fdw-wizard-pdfproducer\"}," + "{\"artifact_id\":\"module-fdw-wizard\"},"
                + "{\"artifact_id\":\"module-form-address\"}," + "{\"artifact_id\":\"module-form-compare-validators\"},"
                + "{\"artifact_id\":\"module-form-date-validators\"}," + "{\"artifact_id\":\"module-form-exportdatabase\"},"
                + "{\"artifact_id\":\"module-form-exportdirectory\"}," + "{\"artifact_id\":\"module-form-googlemaps\"},"
                + "{\"artifact_id\":\"module-form-include-opengraph\"}," + "{\"artifact_id\":\"module-formengine-aidespjaventures\"},"
                + "{\"artifact_id\":\"module-formengine-aidespjtalents\"}," + "{\"artifact_id\":\"module-formengine-dansmarue\"},"
                + "{\"artifact_id\":\"module-formengine-etatcivil\"}," + "{\"artifact_id\":\"module-formengine-evac\"},"
                + "{\"artifact_id\":\"module-formengine-facilfamilles\"}," + "{\"artifact_id\":\"module-formengine-gis\"},"
                + "{\"artifact_id\":\"module-formengine-outputdb\"}," + "{\"artifact_id\":\"module-formengine-outputws\"},"
                + "{\"artifact_id\":\"module-formengine-pjaventures\"}," + "{\"artifact_id\":\"module-formengine-pjsolidaires\"},"
                + "{\"artifact_id\":\"module-formengine-pjtalents\"}," + "{\"artifact_id\":\"module-formengine-projeau\"},"
                + "{\"artifact_id\":\"module-formengine-ramen\"}," + "{\"artifact_id\":\"module-formengine-rens\"},"
                + "{\"artifact_id\":\"module-formengine-saisine\"}," + "{\"artifact_id\":\"module-formengine-sample\"},"
                + "{\"artifact_id\":\"module-formengine-signalement\"}," + "{\"artifact_id\":\"module-forms-breadcrumbaccordion\"},"
                + "{\"artifact_id\":\"module-forms-documentproducer\"}," + "{\"artifact_id\":\"module-forms-multiviewmapleaflet\"},"
                + "{\"artifact_id\":\"module-genericattributes-address\"}," + "{\"artifact_id\":\"module-genericattributes-gis\"},"
                + "{\"artifact_id\":\"module-genericattributes-gismap\"}," + "{\"artifact_id\":\"module-genericattributes-googlemaps\"},"
                + "{\"artifact_id\":\"module-genericattributes-openstreetmap\"}," + "{\"artifact_id\":\"module-gipse-workflow\"},"
                + "{\"artifact_id\":\"module-gis-address\"}," + "{\"artifact_id\":\"module-gru-elastics\"}," + "{\"artifact_id\":\"module-gru-gra\"},"
                + "{\"artifact_id\":\"module-grusupply-database\"}," + "{\"artifact_id\":\"module-grusupply-elastic\"},"
                + "{\"artifact_id\":\"module-grusupply-openam\"}," + "{\"artifact_id\":\"module-helpdesk-solr\"}," + "{\"artifact_id\":\"module-html-rest\"},"
                + "{\"artifact_id\":\"module-htmldocs-solr\"}," + "{\"artifact_id\":\"module-htmlpage-solr\"},"
                + "{\"artifact_id\":\"module-identitystore-agentcertifier\"}," + "{\"artifact_id\":\"module-identitystore-cnicertifier\"},"
                + "{\"artifact_id\":\"module-identitystore-fccertifier\"}," + "{\"artifact_id\":\"module-identitystore-grucertifier\"},"
                + "{\"artifact_id\":\"module-identitystore-indexer\"}," + "{\"artifact_id\":\"module-identitystore-mobilecertifier\"},"
                + "{\"artifact_id\":\"module-identitystore-openam\"}," + "{\"artifact_id\":\"module-indicator-bild\"},"
                + "{\"artifact_id\":\"module-intraparis-htmlpage\"}," + "{\"artifact_id\":\"module-intraparis-myapps\"},"
                + "{\"artifact_id\":\"module-jpa-hibernate\"}," + "{\"artifact_id\":\"module-jsr170-solr\"},"
                + "{\"artifact_id\":\"module-library-quickpick\"}," + "{\"artifact_id\":\"module-myapps-database\"},"
                + "{\"artifact_id\":\"module-myapps-wsso\"}," + "{\"artifact_id\":\"module-mydashboard-avatar\"},"
                + "{\"artifact_id\":\"module-mydashboard-bp\"}," + "{\"artifact_id\":\"module-mydashboard-favorites\"},"
                + "{\"artifact_id\":\"module-mydashboard-gru\"}," + "{\"artifact_id\":\"module-mydashboard-identity-gra\"},"
                + "{\"artifact_id\":\"module-mydashboard-identity-pocgra\"}," + "{\"artifact_id\":\"module-mydashboard-identity\"},"
                + "{\"artifact_id\":\"module-mydashboard-identitygra\"}," + "{\"artifact_id\":\"module-mydashboard-myaccount\"},"
                + "{\"artifact_id\":\"module-mydashboard-mylutecedatabase\"}," + "{\"artifact_id\":\"module-mylutece-cas\"},"
                + "{\"artifact_id\":\"module-mylutece-casexternal\"}," + "{\"artifact_id\":\"module-mylutece-database\"},"
                + "{\"artifact_id\":\"module-mylutece-databaseopenid\"}," + "{\"artifact_id\":\"module-mylutece-directory\"},"
                + "{\"artifact_id\":\"module-mylutece-external\"}," + "{\"artifact_id\":\"module-mylutece-franceconnect\"},"
                + "{\"artifact_id\":\"module-mylutece-habilitation\"}," + "{\"artifact_id\":\"module-mylutece-ldapdatabase\"},"
                + "{\"artifact_id\":\"module-mylutece-notification\"}," + "{\"artifact_id\":\"module-mylutece-oauth\"},"
                + "{\"artifact_id\":\"module-mylutece-oauth2\"}," + "{\"artifact_id\":\"module-mylutece-openam\"},"
                + "{\"artifact_id\":\"module-mylutece-openid\"}," + "{\"artifact_id\":\"module-mylutece-openiddatabase\"},"
                + "{\"artifact_id\":\"module-mylutece-opensso\"}," + "{\"artifact_id\":\"module-mylutece-parisconnect\"},"
                + "{\"artifact_id\":\"module-mylutece-persona\"}," + "{\"artifact_id\":\"module-mylutece-porfou-database\"},"
                + "{\"artifact_id\":\"module-mylutece-rest\"}," + "{\"artifact_id\":\"module-mylutece-saml\"},"
                + "{\"artifact_id\":\"module-mylutece-webserver\"}," + "{\"artifact_id\":\"module-mylutece-websso\"},"
                + "{\"artifact_id\":\"module-mylutece-wssodatabase-pass\"}," + "{\"artifact_id\":\"module-mylutece-wssodatabase\"},"
                + "{\"artifact_id\":\"module-myluteceusergu-crm\"}," + "{\"artifact_id\":\"module-myportal-chronogestor\"},"
                + "{\"artifact_id\":\"module-myportal-myapps\"}," + "{\"artifact_id\":\"module-myportal-mycrmnotifications\"},"
                + "{\"artifact_id\":\"module-myportal-myfavorites\"}," + "{\"artifact_id\":\"module-myportal-mytasks\"},"
                + "{\"artifact_id\":\"module-myportal-rss\"}," + "{\"artifact_id\":\"module-newsletter-blog\"},"
                + "{\"artifact_id\":\"module-newsletter-document\"}," + "{\"artifact_id\":\"module-newsletter-htmldocs\"},"
                + "{\"artifact_id\":\"module-notifygru-appointment\"}," + "{\"artifact_id\":\"module-notifygru-dacic\"},"
                + "{\"artifact_id\":\"module-notifygru-dacicartdramatique\"}," + "{\"artifact_id\":\"module-notifygru-dacicmusiquedanse\"},"
                + "{\"artifact_id\":\"module-notifygru-directory\"}," + "{\"artifact_id\":\"module-notifygru-forms\"},"
                + "{\"artifact_id\":\"module-notifygru-ideation\"}," + "{\"artifact_id\":\"module-notifygru-parisapps\"},"
                + "{\"artifact_id\":\"module-notifygru-ticketing\"}," + "{\"artifact_id\":\"module-ods-cp-io\"}," + "{\"artifact_id\":\"module-ods-cp\"},"
                + "{\"artifact_id\":\"module-ods-ma\"}," + "{\"artifact_id\":\"module-ods-solr\"}," + "{\"artifact_id\":\"module-pass-annuaire\"},"
                + "{\"artifact_id\":\"module-pass-coordin\"}," + "{\"artifact_id\":\"module-pass-remi\"}," + "{\"artifact_id\":\"module-pasu-crm\"},"
                + "{\"artifact_id\":\"module-pasu-shoppingcart\"}," + "{\"artifact_id\":\"module-porfou-documentum\"},"
                + "{\"artifact_id\":\"module-porfou-mylutecedatabase\"}," + "{\"artifact_id\":\"module-porfou-sapws\"},"
                + "{\"artifact_id\":\"module-provider-appointment\"}," + "{\"artifact_id\":\"module-provider-directory\"},"
                + "{\"artifact_id\":\"module-provider-ticketing\"}," + "{\"artifact_id\":\"module-quiz-exportdirectory\"},"
                + "{\"artifact_id\":\"module-quiz-games\"}," + "{\"artifact_id\":\"module-quiz-jeuxconcours\"}," + "{\"artifact_id\":\"module-quiz-rest\"},"
                + "{\"artifact_id\":\"module-ramen-rest\"}," + "{\"artifact_id\":\"module-rating-mydashboard\"},"
                + "{\"artifact_id\":\"module-resource-adminuser\"}," + "{\"artifact_id\":\"module-resource-extendableresource\"},"
                + "{\"artifact_id\":\"module-resource-mylutece\"}," + "{\"artifact_id\":\"module-sap-connect\"}," + "{\"artifact_id\":\"module-seo-crm\"},"
                + "{\"artifact_id\":\"module-seo-digglike\"}," + "{\"artifact_id\":\"module-seo-document\"}," + "{\"artifact_id\":\"module-seo-robots\"},"
                + "{\"artifact_id\":\"module-seo-suggest\"}," + "{\"artifact_id\":\"module-seo-wiki\"}," + "{\"artifact_id\":\"module-signalement-ramen\"},"
                + "{\"artifact_id\":\"module-signalement-rest\"}," + "{\"artifact_id\":\"module-sira-rest\"},"
                + "{\"artifact_id\":\"module-socialhub-comment\"}," + "{\"artifact_id\":\"module-socialhub-rating\"},"
                + "{\"artifact_id\":\"module-socialhub-statistics\"}," + "{\"artifact_id\":\"module-socialhub-youropinion\"},"
                + "{\"artifact_id\":\"module-solrserver-directory\"}," + "{\"artifact_id\":\"module-stock-billetterie\"},"
                + "{\"artifact_id\":\"module-stock-kiosque\"}," + "{\"artifact_id\":\"module-stock-recommendation\"},"
                + "{\"artifact_id\":\"module-stock-solr\"}," + "{\"artifact_id\":\"module-stock-tickets\"},"
                + "{\"artifact_id\":\"module-subscribe-mydashboard\"}," + "{\"artifact_id\":\"module-taxbal-surfaces\"},"
                + "{\"artifact_id\":\"module-testrelease\"}," + "{\"artifact_id\":\"module-ticketing-facilfamilles\"},"
                + "{\"artifact_id\":\"module-ticketing-gru\"}," + "{\"artifact_id\":\"module-ticketing-pocgru\"},"
                + "{\"artifact_id\":\"module-unittree-gra\"}," + "{\"artifact_id\":\"module-unittree-notification\"},"
                + "{\"artifact_id\":\"module-unittree-profiles\"}," + "{\"artifact_id\":\"module-unittree-sira\"},"
                + "{\"artifact_id\":\"module-urlrewriteradmin-document\"}," + "{\"artifact_id\":\"module-wiki-solr\"},"
                + "{\"artifact_id\":\"module-workflow-alert\"}," + "{\"artifact_id\":\"module-workflow-alpaca\"},"
                + "{\"artifact_id\":\"module-workflow-appointment\"}," + "{\"artifact_id\":\"module-workflow-arbres\"},"
                + "{\"artifact_id\":\"module-workflow-archive\"}," + "{\"artifact_id\":\"module-workflow-automatic-assignment\"},"
                + "{\"artifact_id\":\"module-workflow-bourserecherche\"}," + "{\"artifact_id\":\"module-workflow-calcul-declaration-immat\"},"
                + "{\"artifact_id\":\"module-workflow-courtmetrage\"}," + "{\"artifact_id\":\"module-workflow-createpdf\"},"
                + "{\"artifact_id\":\"module-workflow-dansmarue\"}," + "{\"artifact_id\":\"module-workflow-declaration-immat\"},"
                + "{\"artifact_id\":\"module-workflow-delib\"}," + "{\"artifact_id\":\"module-workflow-deployment\"},"
                + "{\"artifact_id\":\"module-workflow-directorydemands\"}," + "{\"artifact_id\":\"module-workflow-directoryfile\"},"
                + "{\"artifact_id\":\"module-workflow-editrecord\"}," + "{\"artifact_id\":\"module-workflow-elasticsearch\"},"
                + "{\"artifact_id\":\"module-workflow-eudonetdirectory\"}," + "{\"artifact_id\":\"module-workflow-eudonetrestdirectory\"},"
                + "{\"artifact_id\":\"module-workflow-evaluation\"}," + "{\"artifact_id\":\"module-workflow-exportfile\"},"
                + "{\"artifact_id\":\"module-workflow-fillingdirectory\"}," + "{\"artifact_id\":\"module-workflow-formincrement\"},"
                + "{\"artifact_id\":\"module-workflow-formlimit\"}," + "{\"artifact_id\":\"module-workflow-forms-automatic-assignment\"},"
                + "{\"artifact_id\":\"module-workflow-forms\"}," + "{\"artifact_id\":\"module-workflow-formsjasper\"},"
                + "{\"artifact_id\":\"module-workflow-formspdf\"}," + "{\"artifact_id\":\"module-workflow-ideation\"},"
                + "{\"artifact_id\":\"module-workflow-manageerror\"}," + "{\"artifact_id\":\"module-workflow-mappings\"},"
                + "{\"artifact_id\":\"module-workflow-mylutece-validation\"}," + "{\"artifact_id\":\"module-workflow-notify-gildha-meubles-tourisme\"},"
                + "{\"artifact_id\":\"module-workflow-notifyagate\"}," + "{\"artifact_id\":\"module-workflow-notifycrm\"},"
                + "{\"artifact_id\":\"module-workflow-notifycrmnoesb\"}," + "{\"artifact_id\":\"module-workflow-notifydacic\"},"
                + "{\"artifact_id\":\"module-workflow-notifydacicartdramatique\"}," + "{\"artifact_id\":\"module-workflow-notifydacicmusiquedanse\"},"
                + "{\"artifact_id\":\"module-workflow-notifydirectory\"}," + "{\"artifact_id\":\"module-workflow-notifydocumentbp\"},"
                + "{\"artifact_id\":\"module-workflow-notifyesirius\"}," + "{\"artifact_id\":\"module-workflow-notifygru\"},"
                + "{\"artifact_id\":\"module-workflow-notifyideation\"}," + "{\"artifact_id\":\"module-workflow-notifymylutece\"},"
                + "{\"artifact_id\":\"module-workflow-notifyqmatic\"}," + "{\"artifact_id\":\"module-workflow-previewnotification\"},"
                + "{\"artifact_id\":\"module-workflow-qmaticappointment\"}," + "{\"artifact_id\":\"module-workflow-ramen\"},"
                + "{\"artifact_id\":\"module-workflow-reassignment\"}," + "{\"artifact_id\":\"module-workflow-releaser\"},"
                + "{\"artifact_id\":\"module-workflow-rest\"}," + "{\"artifact_id\":\"module-workflow-signalement\"},"
                + "{\"artifact_id\":\"module-workflow-stele\"}," + "{\"artifact_id\":\"module-workflow-ticketing\"},"
                + "{\"artifact_id\":\"module-workflow-tipi\"}," + "{\"artifact_id\":\"module-workflow-tipiforms\"},"
                + "{\"artifact_id\":\"module-workflow-unittree\"}," + "{\"artifact_id\":\"module-workflow-upload\"},"
                + "{\"artifact_id\":\"module-workflow-usergu-openam\"}," + "{\"artifact_id\":\"module-workflow-usergu\"},"
                + "{\"artifact_id\":\"module-xdocreport-delib\"}," + "{\"artifact_id\":\"plugin-accrochageff\"}," + "{\"artifact_id\":\"plugin-actes\"},"
                + "{\"artifact_id\":\"plugin-address\"}," + "{\"artifact_id\":\"plugin-adminasynchupload\"},"
                + "{\"artifact_id\":\"plugin-adminauthenticationdatabase\"}," + "{\"artifact_id\":\"plugin-adminauthenticationwsso\"},"
                + "{\"artifact_id\":\"plugin-adminavatar\"}," + "{\"artifact_id\":\"plugin-adminquery\"}," + "{\"artifact_id\":\"plugin-adminsql\"},"
                + "{\"artifact_id\":\"plugin-adminwall\"}," + "{\"artifact_id\":\"plugin-advert\"}," + "{\"artifact_id\":\"plugin-agate\"},"
                + "{\"artifact_id\":\"plugin-agateaa\"}," + "{\"artifact_id\":\"plugin-alpaca\"}," + "{\"artifact_id\":\"plugin-announce\"},"
                + "{\"artifact_id\":\"plugin-antexecuter\"}," + "{\"artifact_id\":\"plugin-apilocannonces\"}," + "{\"artifact_id\":\"plugin-appcenter\"},"
                + "{\"artifact_id\":\"plugin-applitest\"}," + "{\"artifact_id\":\"plugin-appointment-aapkf\"}," + "{\"artifact_id\":\"plugin-appointment\"},"
                + "{\"artifact_id\":\"plugin-appointmentfactory\"}," + "{\"artifact_id\":\"plugin-appstore\"}," + "{\"artifact_id\":\"plugin-arbres\"},"
                + "{\"artifact_id\":\"plugin-archive-client\"}," + "{\"artifact_id\":\"plugin-archive\"}," + "{\"artifact_id\":\"plugin-are\"},"
                + "{\"artifact_id\":\"plugin-asynchronousupload\"}," + "{\"artifact_id\":\"plugin-atelierartistes\"}," + "{\"artifact_id\":\"plugin-avatar\"},"
                + "{\"artifact_id\":\"plugin-avatarserver\"}," + "{\"artifact_id\":\"plugin-azur\"}," + "{\"artifact_id\":\"plugin-bandeaugra\"},"
                + "{\"artifact_id\":\"plugin-batchgraidentity\"}," + "{\"artifact_id\":\"plugin-blobstore\"},"
                + "{\"artifact_id\":\"plugin-blobstoreclient\"}," + "{\"artifact_id\":\"plugin-blog\"},"
                + "{\"artifact_id\":\"plugin-bootstrap2compatibility\"}," + "{\"artifact_id\":\"plugin-budgetparticipatif-idee\"},"
                + "{\"artifact_id\":\"plugin-budgetparticipatif\"}," + "{\"artifact_id\":\"plugin-calculetteqf\"}," + "{\"artifact_id\":\"plugin-calendar\"},"
                + "{\"artifact_id\":\"plugin-campagnebp\"}," + "{\"artifact_id\":\"plugin-captcha\"}," + "{\"artifact_id\":\"plugin-casvp\"},"
                + "{\"artifact_id\":\"plugin-casvpeau\"}," + "{\"artifact_id\":\"plugin-chat\"}," + "{\"artifact_id\":\"plugin-chatbot\"},"
                + "{\"artifact_id\":\"plugin-childpages\"}," + "{\"artifact_id\":\"plugin-cmis\"}," + "{\"artifact_id\":\"plugin-codewizard\"},"
                + "{\"artifact_id\":\"plugin-comarquage\"}," + "{\"artifact_id\":\"plugin-contact\"}," + "{\"artifact_id\":\"plugin-contextinclude\"},"
                + "{\"artifact_id\":\"plugin-costumerprovisionning\"}," + "{\"artifact_id\":\"plugin-cotationdls-business\"},"
                + "{\"artifact_id\":\"plugin-cotationdls\"}," + "{\"artifact_id\":\"plugin-couponreponse\"}," + "{\"artifact_id\":\"plugin-courtmetrage\"},"
                + "{\"artifact_id\":\"plugin-crm\"}," + "{\"artifact_id\":\"plugin-crmclient\"}," + "{\"artifact_id\":\"plugin-customerprovisioning\"},"
                + "{\"artifact_id\":\"plugin-customerprovisionning\"}," + "{\"artifact_id\":\"plugin-dacic\"},"
                + "{\"artifact_id\":\"plugin-dacicartdramatique\"}," + "{\"artifact_id\":\"plugin-dacicmusiquedanse\"},"
                + "{\"artifact_id\":\"plugin-dansmarue\"}," + "{\"artifact_id\":\"plugin-dataviz\"}," + "{\"artifact_id\":\"plugin-davanne\"},"
                + "{\"artifact_id\":\"plugin-dbpage\"}," + "{\"artifact_id\":\"plugin-declarationimmat\"}," + "{\"artifact_id\":\"plugin-delib\"},"
                + "{\"artifact_id\":\"plugin-deployment\"}," + "{\"artifact_id\":\"plugin-depot-pj-SIEL\"}," + "{\"artifact_id\":\"plugin-digglike\"},"
                + "{\"artifact_id\":\"plugin-dila\"}," + "{\"artifact_id\":\"plugin-directory\"}," + "{\"artifact_id\":\"plugin-disconnection\"},"
                + "{\"artifact_id\":\"plugin-document\"}," + "{\"artifact_id\":\"plugin-docupaie\"}," + "{\"artifact_id\":\"plugin-easyrulesbot\"},"
                + "{\"artifact_id\":\"plugin-elasticdata\"}," + "{\"artifact_id\":\"plugin-elasticsearch\"}," + "{\"artifact_id\":\"plugin-els-statistics\"},"
                + "{\"artifact_id\":\"plugin-emergence\"}," + "{\"artifact_id\":\"plugin-epetition\"}," + "{\"artifact_id\":\"plugin-eudonetbp\"},"
                + "{\"artifact_id\":\"plugin-eudonetpvnet\"}," + "{\"artifact_id\":\"plugin-expense\"},"
                + "{\"artifact_id\":\"plugin-export-userpreferences\"}," + "{\"artifact_id\":\"plugin-exportmultiviewgra\"},"
                + "{\"artifact_id\":\"plugin-expositions\"}," + "{\"artifact_id\":\"plugin-extend\"}," + "{\"artifact_id\":\"plugin-extendfollow\"},"
                + "{\"artifact_id\":\"plugin-fccertifier\"}," + "{\"artifact_id\":\"plugin-fcsample\"},"
                + "{\"artifact_id\":\"plugin-federate-database-franceconnect\"}," + "{\"artifact_id\":\"plugin-fermetureperiph\"},"
                + "{\"artifact_id\":\"plugin-fileexport\"}," + "{\"artifact_id\":\"plugin-files2docs-old\"}," + "{\"artifact_id\":\"plugin-files2docs\"},"
                + "{\"artifact_id\":\"plugin-folderlisting\"}," + "{\"artifact_id\":\"plugin-form-aapkf\"}," + "{\"artifact_id\":\"plugin-form\"},"
                + "{\"artifact_id\":\"plugin-formengine\"}," + "{\"artifact_id\":\"plugin-forms\"}," + "{\"artifact_id\":\"plugin-formxml\"},"
                + "{\"artifact_id\":\"plugin-franceconnect\"}," + "{\"artifact_id\":\"plugin-ganalytics\"},"
                + "{\"artifact_id\":\"plugin-genericattributes\"}," + "{\"artifact_id\":\"plugin-gfa\"},"
                + "{\"artifact_id\":\"plugin-gildha-meubles-tourisme\"}," + "{\"artifact_id\":\"plugin-gipse\"}," + "{\"artifact_id\":\"plugin-gis\"},"
                + "{\"artifact_id\":\"plugin-gismap\"}," + "{\"artifact_id\":\"plugin-googleapi\"}," + "{\"artifact_id\":\"plugin-grandprix\"},"
                + "{\"artifact_id\":\"plugin-graphite\"}," + "{\"artifact_id\":\"plugin-greetingscard\"}," + "{\"artifact_id\":\"plugin-gru-indexing\"},"
                + "{\"artifact_id\":\"plugin-gru\"}," + "{\"artifact_id\":\"plugin-grukeydiversification\"}," + "{\"artifact_id\":\"plugin-grustoragedb\"},"
                + "{\"artifact_id\":\"plugin-grustorageelastic\"}," + "{\"artifact_id\":\"plugin-grusupply\"}," + "{\"artifact_id\":\"plugin-gtools\"},"
                + "{\"artifact_id\":\"plugin-hellokt\"}," + "{\"artifact_id\":\"plugin-helpdesk\"}," + "{\"artifact_id\":\"plugin-hipolite\"},"
                + "{\"artifact_id\":\"plugin-html\"}," + "{\"artifact_id\":\"plugin-htmldocs\"}," + "{\"artifact_id\":\"plugin-htmlpage\"},"
                + "{\"artifact_id\":\"plugin-ideation\"}," + "{\"artifact_id\":\"plugin-identity-provider\"},"
                + "{\"artifact_id\":\"plugin-identitystore-agent\"}," + "{\"artifact_id\":\"plugin-identitystore-myluteceprovider\"},"
                + "{\"artifact_id\":\"plugin-identitystore-openamprovider\"}," + "{\"artifact_id\":\"plugin-identitystore\"},"
                + "{\"artifact_id\":\"plugin-importexport\"}," + "{\"artifact_id\":\"plugin-indicator\"}," + "{\"artifact_id\":\"plugin-insertajax\"},"
                + "{\"artifact_id\":\"plugin-insertalbum\"}," + "{\"artifact_id\":\"plugin-insertmap\"}," + "{\"artifact_id\":\"plugin-interfacenuu\"},"
                + "{\"artifact_id\":\"plugin-intraparis-includeurlbandeau\"}," + "{\"artifact_id\":\"plugin-intraparis-roleprovider\"},"
                + "{\"artifact_id\":\"plugin-jasper\"}," + "{\"artifact_id\":\"plugin-jcaptcha\"}," + "{\"artifact_id\":\"plugin-jmx\"},"
                + "{\"artifact_id\":\"plugin-jmxtrans\"}," + "{\"artifact_id\":\"plugin-journal\"}," + "{\"artifact_id\":\"plugin-jpatest\"},"
                + "{\"artifact_id\":\"plugin-jsr168\"}," + "{\"artifact_id\":\"plugin-jsr170\"}," + "{\"artifact_id\":\"plugin-jsr286\"},"
                + "{\"artifact_id\":\"plugin-kibana\"}," + "{\"artifact_id\":\"plugin-ldapdirectory\"}," + "{\"artifact_id\":\"plugin-leaflet\"},"
                + "{\"artifact_id\":\"plugin-lel\"}," + "{\"artifact_id\":\"plugin-library\"}," + "{\"artifact_id\":\"plugin-limitconnectedusers\"},"
                + "{\"artifact_id\":\"plugin-linkpages\"}," + "{\"artifact_id\":\"plugin-links\"}," + "{\"artifact_id\":\"plugin-lobbycal\"},"
                + "{\"artifact_id\":\"plugin-logementuserattributes\"}," + "{\"artifact_id\":\"plugin-logilist\"}," + "{\"artifact_id\":\"plugin-lotus\"},"
                + "{\"artifact_id\":\"plugin-lutecedocfeeder\"}," + "{\"artifact_id\":\"plugin-lutecetools\"}," + "{\"artifact_id\":\"plugin-managewferror\"},"
                + "{\"artifact_id\":\"plugin-marketplace\"}," + "{\"artifact_id\":\"plugin-mdph\"}," + "{\"artifact_id\":\"plugin-memorial\"},"
                + "{\"artifact_id\":\"plugin-menus\"}," + "{\"artifact_id\":\"plugin-mergingaccounts\"}," + "{\"artifact_id\":\"plugin-mobilecertifier\"},"
                + "{\"artifact_id\":\"plugin-modulenotifygrumappingmanager\"}," + "{\"artifact_id\":\"plugin-multiloc\"},"
                + "{\"artifact_id\":\"plugin-multimedia\"}," + "{\"artifact_id\":\"plugin-mvcdemo\"}," + "{\"artifact_id\":\"plugin-myapps\"},"
                + "{\"artifact_id\":\"plugin-mydashboard\"}," + "{\"artifact_id\":\"plugin-myfiles\"}," + "{\"artifact_id\":\"plugin-mylutece\"},"
                + "{\"artifact_id\":\"plugin-mylutecetest\"}," + "{\"artifact_id\":\"plugin-myluteceuser-gu-openam\"},"
                + "{\"artifact_id\":\"plugin-myluteceuser-gu\"}," + "{\"artifact_id\":\"plugin-mypage\"}," + "{\"artifact_id\":\"plugin-myportal\"},"
                + "{\"artifact_id\":\"plugin-mytasks\"}," + "{\"artifact_id\":\"plugin-newsletter\"}," + "{\"artifact_id\":\"plugin-nuitsolidarite\"},"
                + "{\"artifact_id\":\"plugin-oauth2\"}," + "{\"artifact_id\":\"plugin-odjcp\"}," + "{\"artifact_id\":\"plugin-ods\"},"
                + "{\"artifact_id\":\"plugin-ohloh\"}," + "{\"artifact_id\":\"plugin-openagenda\"}," + "{\"artifact_id\":\"plugin-openam-identity-client\"},"
                + "{\"artifact_id\":\"plugin-openam-identity\"}," + "{\"artifact_id\":\"plugin-opendata\"}," + "{\"artifact_id\":\"plugin-pagelinkservice\"},"
                + "{\"artifact_id\":\"plugin-paris2030\"}," + "{\"artifact_id\":\"plugin-parisalacarte\"}," + "{\"artifact_id\":\"plugin-parisapps\"},"
                + "{\"artifact_id\":\"plugin-parisconnect\"}," + "{\"artifact_id\":\"plugin-parisvideo\"}," + "{\"artifact_id\":\"plugin-pass\"},"
                + "{\"artifact_id\":\"plugin-pasu\"}," + "{\"artifact_id\":\"plugin-paybox\"}," + "{\"artifact_id\":\"plugin-peps\"},"
                + "{\"artifact_id\":\"plugin-phraseanet\"}," + "{\"artifact_id\":\"plugin-piwik\"}," + "{\"artifact_id\":\"plugin-pjjury\"},"
                + "{\"artifact_id\":\"plugin-plu\"}," + "{\"artifact_id\":\"plugin-pluginwizard\"}," + "{\"artifact_id\":\"plugin-poll\"},"
                + "{\"artifact_id\":\"plugin-pollingstationsearch\"}," + "{\"artifact_id\":\"plugin-porfou\"}," + "{\"artifact_id\":\"plugin-portalrest\"},"
                + "{\"artifact_id\":\"plugin-ppsa\"}," + "{\"artifact_id\":\"plugin-proelections\"}," + "{\"artifact_id\":\"plugin-profanity-filter\"},"
                + "{\"artifact_id\":\"plugin-profiles\"}," + "{\"artifact_id\":\"plugin-pwa\"}," + "{\"artifact_id\":\"plugin-quicklinks\"},"
                + "{\"artifact_id\":\"plugin-quiz\"}," + "{\"artifact_id\":\"plugin-quotientfamille\"}," + "{\"artifact_id\":\"plugin-ramen\"},"
                + "{\"artifact_id\":\"plugin-rapo\"}," + "{\"artifact_id\":\"plugin-rating\"}," + "{\"artifact_id\":\"plugin-rbmtfps\"},"
                + "{\"artifact_id\":\"plugin-recast\"}," + "{\"artifact_id\":\"plugin-recastbots\"}," + "{\"artifact_id\":\"plugin-recommendation\"},"
                + "{\"artifact_id\":\"plugin-reemploi\"}," + "{\"artifact_id\":\"plugin-regularexpression\"},"
                + "{\"artifact_id\":\"plugin-releaser-test-svn\"}," + "{\"artifact_id\":\"plugin-releaser-test\"}," + "{\"artifact_id\":\"plugin-releaser\"},"
                + "{\"artifact_id\":\"plugin-reporting\"}," + "{\"artifact_id\":\"plugin-reportlauncher\"}," + "{\"artifact_id\":\"plugin-resource\"},"
                + "{\"artifact_id\":\"plugin-rest\"}," + "{\"artifact_id\":\"plugin-ria\"}," + "{\"artifact_id\":\"plugin-rss\"},"
                + "{\"artifact_id\":\"plugin-searchasso\"}," + "{\"artifact_id\":\"plugin-searchldap\"}," + "{\"artifact_id\":\"plugin-searchstats\"},"
                + "{\"artifact_id\":\"plugin-selfregistration\"}," + "{\"artifact_id\":\"plugin-seo\"}," + "{\"artifact_id\":\"plugin-sfpi\"},"
                + "{\"artifact_id\":\"plugin-shoppingcart\"}," + "{\"artifact_id\":\"plugin-shorturl\"}," + "{\"artifact_id\":\"plugin-siel\"},"
                + "{\"artifact_id\":\"plugin-signalement\"}," + "{\"artifact_id\":\"plugin-sima\"}," + "{\"artifact_id\":\"plugin-sitelabels\"},"
                + "{\"artifact_id\":\"plugin-sitemap\"}," + "{\"artifact_id\":\"plugin-socialhub\"}," + "{\"artifact_id\":\"plugin-solr-nutch\"},"
                + "{\"artifact_id\":\"plugin-solr\"}," + "{\"artifact_id\":\"plugin-solrserver\"}," + "{\"artifact_id\":\"plugin-sponsoredlinks\"},"
                + "{\"artifact_id\":\"plugin-sqlpage\"}," + "{\"artifact_id\":\"plugin-stationnement\"}," + "{\"artifact_id\":\"plugin-statistiquebp\"},"
                + "{\"artifact_id\":\"plugin-stea\"}," + "{\"artifact_id\":\"plugin-stele\"}," + "{\"artifact_id\":\"plugin-stock\"},"
                + "{\"artifact_id\":\"plugin-subscribe\"}," + "{\"artifact_id\":\"plugin-suggest\"}," + "{\"artifact_id\":\"plugin-swaggerui\"},"
                + "{\"artifact_id\":\"plugin-systeminfo\"}," + "{\"artifact_id\":\"plugin-tagcloud\"}," + "{\"artifact_id\":\"plugin-taxbal\"},"
                + "{\"artifact_id\":\"plugin-taxepro\"}," + "{\"artifact_id\":\"plugin-taxsimulator\"}," + "{\"artifact_id\":\"plugin-test-gitlab-project\"},"
                + "{\"artifact_id\":\"plugin-testci\"}," + "{\"artifact_id\":\"plugin-testlibrary\"}," + "{\"artifact_id\":\"plugin-testrelease\"},"
                + "{\"artifact_id\":\"plugin-theme\"}," + "{\"artifact_id\":\"plugin-threadlogger\"}," + "{\"artifact_id\":\"plugin-ticketing\"},"
                + "{\"artifact_id\":\"plugin-transparency\"}," + "{\"artifact_id\":\"plugin-unittree\"}," + "{\"artifact_id\":\"plugin-updater\"},"
                + "{\"artifact_id\":\"plugin-updatercatalog\"}," + "{\"artifact_id\":\"plugin-upload\"}," + "{\"artifact_id\":\"plugin-uploadimage\"},"
                + "{\"artifact_id\":\"plugin-urlrewriter\"}," + "{\"artifact_id\":\"plugin-urlrewriteradmin\"}," + "{\"artifact_id\":\"plugin-userban\"},"
                + "{\"artifact_id\":\"plugin-userws\"}," + "{\"artifact_id\":\"plugin-uwa\"}," + "{\"artifact_id\":\"plugin-vegetalisons\"},"
                + "{\"artifact_id\":\"plugin-verifybackurl\"}," + "{\"artifact_id\":\"plugin-webachats\"}," + "{\"artifact_id\":\"plugin-webappcontainer\"},"
                + "{\"artifact_id\":\"plugin-webtiers\"}," + "{\"artifact_id\":\"plugin-whatsnew\"}," + "{\"artifact_id\":\"plugin-wiki\"},"
                + "{\"artifact_id\":\"plugin-workflow\"}," + "{\"artifact_id\":\"plugin-wrapper\"}," + "{\"artifact_id\":\"plugin-wurfl\"},"
                + "{\"artifact_id\":\"plugin-xdocreport\"}," + "{\"artifact_id\":\"plugin-xmlpage\"}," + "{\"artifact_id\":\"plugin-xpagelinkservice\"},"
                + "{\"artifact_id\":\"plugin-xpageportlet\"}]}";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getJSONComponent( String strArtifactId, Boolean bCache )
    {
        if ( strArtifactId.equals( "lutece-core" ) )
        {
            return "{\"component\":{\"artifact_id\":\"lutece-core\","
                    + "\"version\":\"6.1.1\","
                    + "\"core_version\":\"6.1.1\","
                    + "\"parent_pom_version\":\"4.0.4\","
                    + "\"snapshot_version\":\"6.1.2-SNAPSHOT\","
                    + "\"snapshot_core_version\":\"6.1.2-SNAPSHOT\","
                    + "\"snapshot_parent_pom_version\":\"4.0.6\","
                    + "\"sonar_nb_lines\":null,"
                    + "\"sonar_rci\":null,"
                    + "\"jira_code\":\"LUTECE\","
                    + "\"jira_roadmap_url\":\"https://dev.lutece.paris.fr/jira/projects/LUTECE/?selectedTab=com.atlassian.jira.jira-projects-plugin:roadmap-panel\","
                    + "\"jira_current_version_closed_issues\":0," + "\"jira_current_version_opened_issues\":0,"
                    + "\"scm_url\":\"https://github.com/lutece-platform/lutece-core.git\","
                    + "\"scm_snapshot_url\":\"https://github.com/lutece-platform/lutece-core.git\","
                    + "\"scm_connection\":\"scm:git:https://github.com/lutece-platform/lutece-core.git\","
                    + "\"scm_developer_connection\":\"scm:git:https://github.com/lutece-platform/lutece-core.git\"}}";
        }
        else
        {
            return "{\"component\":{\"artifact_id\":\""
                    + strArtifactId
                    + "\","
                    + "\"version\":\"2.0.15\","
                    + "\"core_version\":\"[6.0.0,"
                    + ")\","
                    + "\"parent_pom_version\":\"4.0.3\","
                    + "\"snapshot_version\":\"2.0.16-SNAPSHOT\","
                    + "\"snapshot_core_version\":\"[6.0.0,"
                    + ")\","
                    + "\"snapshot_parent_pom_version\":\"4.0.3\","
                    + "\"sonar_nb_lines\":null,"
                    + "\"sonar_rci\":null,"
                    + "\"jira_code\":\"TICKETING\","
                    + "\"jira_roadmap_url\":\"https://dev.lutece.paris.fr/jira/projects/TICKETING/?selectedTab=com.atlassian.jira.jira-projects-plugin:roadmap-panel\","
                    + "\"jira_current_version_closed_issues\":0," + "\"jira_current_version_opened_issues\":0,"
                    + "\"scm_url\":\"https://github.com/lutece-platform/lutece-collab-plugin-ticketing.git\","
                    + "\"scm_snapshot_url\":\"https://github.com/lutece-platform/lutece-collab-plugin-ticketing.git\","
                    + "\"scm_connection\":\"scm:git:https://github.com/lutece-platform/lutece-collab-plugin-ticketing.git\","
                    + "\"scm_developer_connection\":\"scm:git:https://github.com/lutece-platform/lutece-collab-plugin-ticketing.git\"}}";
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Component> getFullComponentList( String [ ] listArtifactId, Boolean bCache )
    {
        List<Component> listComp = new ArrayList<>( );
        for ( String strArtifactId : listArtifactId )
        {
            Component comp = getFullComponent( strArtifactId, bCache );
            listComp.add( comp );
        }
        return listComp;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSitePom( SiteBuilderConfDto siteBuilderConf )
    {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" + "<project xmlns=\"http://maven.apache.org/POM/4.0.0\""
                + "         xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\""
                + "         xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd\">" + "" + "    <parent>"
                + "        <artifactId>lutece-site-pom</artifactId>" + "        <groupId>fr.paris.lutece.tools</groupId>" + "        <version>2.0.4</version>"
                + "    </parent>" + "" + "    <modelVersion>4.0.0</modelVersion>" + "    <groupId>fr.paris.lutece</groupId>"
                + "    <artifactId>site-mysite</artifactId>" + "    <packaging>lutece-site</packaging>" + "    <version>1.0.0-SNAPSHOT</version>"
                + "    <name>My site</name>" + "" + "    <repositories>" + "        <repository>" + "            <id>luteceSnapshot</id>"
                + "            <name>luteceSnapshot</name>" + "            <url>http://dev.lutece.paris.fr/snapshot_repository</url>"
                + "            <snapshots>" + "                <enabled>true</enabled>" + "            </snapshots>" + "        </repository>"
                + "        <repository>" + "            <id>lutece</id>" + "            <name>luteceRepository</name>"
                + "            <url>http://dev.lutece.paris.fr/maven_repository</url>" + "            <snapshots>" + "                <enabled>false</enabled>"
                + "            </snapshots>" + "        </repository>" + "    </repositories>" + "" + "    <dependencies>" + "        <dependency>"
                + "            <groupId>fr.paris.lutece</groupId>" + "            <artifactId>lutece-core</artifactId>"
                + "            <version>6.1.1</version>" + "            <type>lutece-core</type>" + "        </dependency>" + "        <dependency>"
                + "            <groupId>fr.paris.lutece.plugins</groupId>" + "            <artifactId>plugin-address</artifactId>"
                + "            <version>1.0.6</version>" + "            <type>plugin</type>" + "        </dependency>" + "    </dependencies>" + ""
                + "    <!--" + "    <scm>" + "        <connection>scm:svn:http://dev.lutece.paris.fr/svn/sites/site-mysite/trunk/</connection>" + "    </scm>"
                + "    -->" + "" + "</project>";
    }
}
