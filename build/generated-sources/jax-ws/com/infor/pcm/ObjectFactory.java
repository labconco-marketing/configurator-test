
package com.infor.pcm;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.infor.pcm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InputParameters_QNAME = new QName("http://infor.com/pcm/v3", "InputParameters");
    private final static QName _Application_QNAME = new QName("http://infor.com/pcm/v3", "Application");
    private final static QName _HeaderDetail_QNAME = new QName("http://infor.com/pcm/v3", "HeaderDetail");
    private final static QName _ArrayOfIntegrationParameter_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfIntegrationParameter");
    private final static QName _IntegrationParameter_QNAME = new QName("http://infor.com/pcm/v3", "IntegrationParameter");
    private final static QName _Parameter_QNAME = new QName("http://infor.com/pcm/v3", "Parameter");
    private final static QName _DataType_QNAME = new QName("http://infor.com/pcm/v3", "DataType");
    private final static QName _ConfigurationMode_QNAME = new QName("http://infor.com/pcm/v3", "ConfigurationMode");
    private final static QName _Part_QNAME = new QName("http://infor.com/pcm/v3", "Part");
    private final static QName _ArrayOfRapidOption_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfRapidOption");
    private final static QName _RapidOption_QNAME = new QName("http://infor.com/pcm/v3", "RapidOption");
    private final static QName _ConfigurationSummary_QNAME = new QName("http://infor.com/pcm/v3", "ConfigurationSummary");
    private final static QName _ArrayOfCommitParameter_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfCommitParameter");
    private final static QName _CommitParameter_QNAME = new QName("http://infor.com/pcm/v3", "CommitParameter");
    private final static QName _ArrayOfDetail_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfDetail");
    private final static QName _Detail_QNAME = new QName("http://infor.com/pcm/v3", "Detail");
    private final static QName _DetailType_QNAME = new QName("http://infor.com/pcm/v3", "DetailType");
    private final static QName _ConfigurationResult_QNAME = new QName("http://infor.com/pcm/v3", "ConfigurationResult");
    private final static QName _ArrayOfSummaryDetail_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfSummaryDetail");
    private final static QName _SummaryDetail_QNAME = new QName("http://infor.com/pcm/v3", "SummaryDetail");
    private final static QName _ArrayOfInputParameters_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfInputParameters");
    private final static QName _ArrayOfHeaderDetail_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfHeaderDetail");
    private final static QName _ArrayOfConfigurationSummary_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfConfigurationSummary");
    private final static QName _ConfigurationDto_QNAME = new QName("http://infor.com/pcm/v3", "ConfigurationDto");
    private final static QName _BaseDto_QNAME = new QName("http://infor.com/pcm/v3", "BaseDto");
    private final static QName _ArrayOfBomComponentDto_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfBomComponentDto");
    private final static QName _BomComponentDto_QNAME = new QName("http://infor.com/pcm/v3", "BomComponentDto");
    private final static QName _ArrayOfAttributeDto_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfAttributeDto");
    private final static QName _AttributeDto_QNAME = new QName("http://infor.com/pcm/v3", "AttributeDto");
    private final static QName _ArrayOfMfgDetailDto_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfMfgDetailDto");
    private final static QName _MfgDetailDto_QNAME = new QName("http://infor.com/pcm/v3", "MfgDetailDto");
    private final static QName _ArrayOfOperationDto_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfOperationDto");
    private final static QName _OperationDto_QNAME = new QName("http://infor.com/pcm/v3", "OperationDto");
    private final static QName _ArrayOfWorkInstructionDto_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfWorkInstructionDto");
    private final static QName _WorkInstructionDto_QNAME = new QName("http://infor.com/pcm/v3", "WorkInstructionDto");
    private final static QName _ArrayOfComponentDto_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfComponentDto");
    private final static QName _ComponentDto_QNAME = new QName("http://infor.com/pcm/v3", "ComponentDto");
    private final static QName _ArrayOfComponentAttributeDto_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfComponentAttributeDto");
    private final static QName _ComponentAttributeDto_QNAME = new QName("http://infor.com/pcm/v3", "ComponentAttributeDto");
    private final static QName _ArrayOfDetailDto_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfDetailDto");
    private final static QName _DetailDto_QNAME = new QName("http://infor.com/pcm/v3", "DetailDto");
    private final static QName _ArrayOfIntegrationOutputDto_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfIntegrationOutputDto");
    private final static QName _IntegrationOutputDto_QNAME = new QName("http://infor.com/pcm/v3", "IntegrationOutputDto");
    private final static QName _ArrayOfIntegrationOutputAttributeDto_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfIntegrationOutputAttributeDto");
    private final static QName _IntegrationOutputAttributeDto_QNAME = new QName("http://infor.com/pcm/v3", "IntegrationOutputAttributeDto");
    private final static QName _ArrayOfPageDto_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfPageDto");
    private final static QName _PageDto_QNAME = new QName("http://infor.com/pcm/v3", "PageDto");
    private final static QName _ArrayOfScreenDto_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfScreenDto");
    private final static QName _ScreenDto_QNAME = new QName("http://infor.com/pcm/v3", "ScreenDto");
    private final static QName _ArrayOfScreenOptionDto_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfScreenOptionDto");
    private final static QName _ScreenOptionDto_QNAME = new QName("http://infor.com/pcm/v3", "ScreenOptionDto");
    private final static QName _FileContentDto_QNAME = new QName("http://infor.com/pcm/v3", "FileContentDto");
    private final static QName _ArrayOfFileContentDto_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfFileContentDto");
    private final static QName _QueueStatus_QNAME = new QName("http://infor.com/pcm/v3", "QueueStatus");
    private final static QName _ArrayOfMfgTemplateAttribute_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfMfgTemplateAttribute");
    private final static QName _MfgTemplateAttribute_QNAME = new QName("http://infor.com/pcm/v3", "MfgTemplateAttribute");
    private final static QName _ArrayOfIntegrationTemplateAttribute_QNAME = new QName("http://infor.com/pcm/v3", "ArrayOfIntegrationTemplateAttribute");
    private final static QName _IntegrationTemplateAttribute_QNAME = new QName("http://infor.com/pcm/v3", "IntegrationTemplateAttribute");
    private final static QName _PredefinedComponentAttribute_QNAME = new QName("http://infor.com/pcm/v3", "PredefinedComponentAttribute");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ConfigureInputParameters_QNAME = new QName("http://infor.com/pcm/v3", "inputParameters");
    private final static QName _ConfigureResponseConfigureResult_QNAME = new QName("http://infor.com/pcm/v3", "ConfigureResult");
    private final static QName _GetCompletedConfigurationsApplication_QNAME = new QName("http://infor.com/pcm/v3", "application");
    private final static QName _GetCompletedConfigurationsHeaderDetails_QNAME = new QName("http://infor.com/pcm/v3", "headerDetails");
    private final static QName _GetCompletedConfigurationsResponseGetCompletedConfigurationsResult_QNAME = new QName("http://infor.com/pcm/v3", "GetCompletedConfigurationsResult");
    private final static QName _LoadConfigurationHeaderDetail_QNAME = new QName("http://infor.com/pcm/v3", "headerDetail");
    private final static QName _LoadConfigurationResponseLoadConfigurationResult_QNAME = new QName("http://infor.com/pcm/v3", "LoadConfigurationResult");
    private final static QName _LoadAllConfigurationsHeaderId_QNAME = new QName("http://infor.com/pcm/v3", "headerId");
    private final static QName _LoadAllConfigurationsResponseLoadAllConfigurationsResult_QNAME = new QName("http://infor.com/pcm/v3", "LoadAllConfigurationsResult");
    private final static QName _LoadFullConfigurationResponseLoadFullConfigurationResult_QNAME = new QName("http://infor.com/pcm/v3", "LoadFullConfigurationResult");
    private final static QName _GetContentUrl_QNAME = new QName("http://infor.com/pcm/v3", "url");
    private final static QName _GetContentResponseGetContentResult_QNAME = new QName("http://infor.com/pcm/v3", "GetContentResult");
    private final static QName _GetDynamicContentResponseGetDynamicContentResult_QNAME = new QName("http://infor.com/pcm/v3", "GetDynamicContentResult");
    private final static QName _CopyConfigurationSource_QNAME = new QName("http://infor.com/pcm/v3", "source");
    private final static QName _CopyConfigurationTarget_QNAME = new QName("http://infor.com/pcm/v3", "target");
    private final static QName _CopyConfigurationResponseCopyConfigurationResult_QNAME = new QName("http://infor.com/pcm/v3", "CopyConfigurationResult");
    private final static QName _CopyAllConfigurationsSourceHeaderId_QNAME = new QName("http://infor.com/pcm/v3", "sourceHeaderId");
    private final static QName _CopyAllConfigurationsTargetHeaderId_QNAME = new QName("http://infor.com/pcm/v3", "targetHeaderId");
    private final static QName _CopyAllConfigurationsResponseCopyAllConfigurationsResult_QNAME = new QName("http://infor.com/pcm/v3", "CopyAllConfigurationsResult");
    private final static QName _PrepareForInteractiveConfigurationPageCaption_QNAME = new QName("http://infor.com/pcm/v3", "pageCaption");
    private final static QName _PrepareForInteractiveConfigurationRedirectUrl_QNAME = new QName("http://infor.com/pcm/v3", "redirectUrl");
    private final static QName _PrepareForInteractiveConfigurationResponsePrepareForInteractiveConfigurationResult_QNAME = new QName("http://infor.com/pcm/v3", "PrepareForInteractiveConfigurationResult");
    private final static QName _GetInteractiveUrlResponseGetInteractiveUrlResult_QNAME = new QName("http://infor.com/pcm/v3", "GetInteractiveUrlResult");
    private final static QName _FinishInteractiveConfigurationResponseFinishInteractiveConfigurationResult_QNAME = new QName("http://infor.com/pcm/v3", "FinishInteractiveConfigurationResult");
    private final static QName _ExecuteExtensionExtensionName_QNAME = new QName("http://infor.com/pcm/v3", "extensionName");
    private final static QName _ExecuteExtensionParameters_QNAME = new QName("http://infor.com/pcm/v3", "parameters");
    private final static QName _ExecuteExtensionResponseExecuteExtensionResult_QNAME = new QName("http://infor.com/pcm/v3", "ExecuteExtensionResult");
    private final static QName _ExportConfigurationResponseExportConfigurationResult_QNAME = new QName("http://infor.com/pcm/v3", "ExportConfigurationResult");
    private final static QName _ImportConfigurationSourceConfigurationXml_QNAME = new QName("http://infor.com/pcm/v3", "sourceConfigurationXml");
    private final static QName _ImportConfigurationTargetHeaderDetail_QNAME = new QName("http://infor.com/pcm/v3", "targetHeaderDetail");
    private final static QName _ImportConfigurationResponseImportConfigurationResult_QNAME = new QName("http://infor.com/pcm/v3", "ImportConfigurationResult");
    private final static QName _QueueConfigurationQueueConfigurationType_QNAME = new QName("http://infor.com/pcm/v3", "queueConfigurationType");
    private final static QName _QueueConfigurationResponseQueueConfigurationResult_QNAME = new QName("http://infor.com/pcm/v3", "QueueConfigurationResult");
    private final static QName _GetQueuedStatusRequestId_QNAME = new QName("http://infor.com/pcm/v3", "requestId");
    private final static QName _SetMfgTemplateTemplateName_QNAME = new QName("http://infor.com/pcm/v3", "templateName");
    private final static QName _SetMfgTemplateAttributes_QNAME = new QName("http://infor.com/pcm/v3", "attributes");
    private final static QName _SetIntegrationTemplateTemplateDescription_QNAME = new QName("http://infor.com/pcm/v3", "templateDescription");
    private final static QName _LoadIntegrationOutputDataTemplateId_QNAME = new QName("http://infor.com/pcm/v3", "templateId");
    private final static QName _LoadIntegrationOutputDataResponseLoadIntegrationOutputDataResult_QNAME = new QName("http://infor.com/pcm/v3", "LoadIntegrationOutputDataResult");
    private final static QName _LoadMfgDataResponseLoadMfgDataResult_QNAME = new QName("http://infor.com/pcm/v3", "LoadMfgDataResult");
    private final static QName _SetPredefinedComponentAttributeAttribute_QNAME = new QName("http://infor.com/pcm/v3", "attribute");
    private final static QName _DeletePredefinedComponentAttributeName_QNAME = new QName("http://infor.com/pcm/v3", "name");
    private final static QName _LoadComponentDataResponseLoadComponentDataResult_QNAME = new QName("http://infor.com/pcm/v3", "LoadComponentDataResult");
    private final static QName _LoadUIDataResponseLoadUIDataResult_QNAME = new QName("http://infor.com/pcm/v3", "LoadUIDataResult");
    private final static QName _LoadInprogressInputParametersContractApplication_QNAME = new QName("http://infor.com/pcm/v3", "contractApplication");
    private final static QName _LoadInprogressInputParametersResponseLoadInprogressInputParametersResult_QNAME = new QName("http://infor.com/pcm/v3", "LoadInprogressInputParametersResult");
    private final static QName _GetApplicationsResponseGetApplicationsResult_QNAME = new QName("http://infor.com/pcm/v3", "GetApplicationsResult");
    private final static QName _ExistsDetailId_QNAME = new QName("http://infor.com/pcm/v3", "detailId");
    private final static QName _IntegrationTemplateAttributeDefaultValue_QNAME = new QName("http://infor.com/pcm/v3", "DefaultValue");
    private final static QName _IntegrationTemplateAttributeDescription_QNAME = new QName("http://infor.com/pcm/v3", "Description");
    private final static QName _ConfigurationSummaryContent_QNAME = new QName("http://infor.com/pcm/v3", "Content");
    private final static QName _ConfigurationSummaryProofingDetails_QNAME = new QName("http://infor.com/pcm/v3", "ProofingDetails");
    private final static QName _ApplicationUser_QNAME = new QName("http://infor.com/pcm/v3", "User");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.infor.pcm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Configure }
     * 
     */
    public Configure createConfigure() {
        return new Configure();
    }

    /**
     * Create an instance of {@link InputParameters }
     * 
     */
    public InputParameters createInputParameters() {
        return new InputParameters();
    }

    /**
     * Create an instance of {@link Application }
     * 
     */
    public Application createApplication() {
        return new Application();
    }

    /**
     * Create an instance of {@link HeaderDetail }
     * 
     */
    public HeaderDetail createHeaderDetail() {
        return new HeaderDetail();
    }

    /**
     * Create an instance of {@link ArrayOfIntegrationParameter }
     * 
     */
    public ArrayOfIntegrationParameter createArrayOfIntegrationParameter() {
        return new ArrayOfIntegrationParameter();
    }

    /**
     * Create an instance of {@link IntegrationParameter }
     * 
     */
    public IntegrationParameter createIntegrationParameter() {
        return new IntegrationParameter();
    }

    /**
     * Create an instance of {@link Parameter }
     * 
     */
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link Part }
     * 
     */
    public Part createPart() {
        return new Part();
    }

    /**
     * Create an instance of {@link ArrayOfRapidOption }
     * 
     */
    public ArrayOfRapidOption createArrayOfRapidOption() {
        return new ArrayOfRapidOption();
    }

    /**
     * Create an instance of {@link RapidOption }
     * 
     */
    public RapidOption createRapidOption() {
        return new RapidOption();
    }

    /**
     * Create an instance of {@link ConfigureResponse }
     * 
     */
    public ConfigureResponse createConfigureResponse() {
        return new ConfigureResponse();
    }

    /**
     * Create an instance of {@link ConfigurationSummary }
     * 
     */
    public ConfigurationSummary createConfigurationSummary() {
        return new ConfigurationSummary();
    }

    /**
     * Create an instance of {@link ArrayOfCommitParameter }
     * 
     */
    public ArrayOfCommitParameter createArrayOfCommitParameter() {
        return new ArrayOfCommitParameter();
    }

    /**
     * Create an instance of {@link CommitParameter }
     * 
     */
    public CommitParameter createCommitParameter() {
        return new CommitParameter();
    }

    /**
     * Create an instance of {@link ArrayOfDetail }
     * 
     */
    public ArrayOfDetail createArrayOfDetail() {
        return new ArrayOfDetail();
    }

    /**
     * Create an instance of {@link Detail }
     * 
     */
    public Detail createDetail() {
        return new Detail();
    }

    /**
     * Create an instance of {@link ArrayOfSummaryDetail }
     * 
     */
    public ArrayOfSummaryDetail createArrayOfSummaryDetail() {
        return new ArrayOfSummaryDetail();
    }

    /**
     * Create an instance of {@link SummaryDetail }
     * 
     */
    public SummaryDetail createSummaryDetail() {
        return new SummaryDetail();
    }

    /**
     * Create an instance of {@link BeginConfigure }
     * 
     */
    public BeginConfigure createBeginConfigure() {
        return new BeginConfigure();
    }

    /**
     * Create an instance of {@link BeginConfigureResponse }
     * 
     */
    public BeginConfigureResponse createBeginConfigureResponse() {
        return new BeginConfigureResponse();
    }

    /**
     * Create an instance of {@link BeginConfigureMany }
     * 
     */
    public BeginConfigureMany createBeginConfigureMany() {
        return new BeginConfigureMany();
    }

    /**
     * Create an instance of {@link ArrayOfInputParameters }
     * 
     */
    public ArrayOfInputParameters createArrayOfInputParameters() {
        return new ArrayOfInputParameters();
    }

    /**
     * Create an instance of {@link BeginConfigureManyResponse }
     * 
     */
    public BeginConfigureManyResponse createBeginConfigureManyResponse() {
        return new BeginConfigureManyResponse();
    }

    /**
     * Create an instance of {@link GetCompletedConfigurations }
     * 
     */
    public GetCompletedConfigurations createGetCompletedConfigurations() {
        return new GetCompletedConfigurations();
    }

    /**
     * Create an instance of {@link ArrayOfHeaderDetail }
     * 
     */
    public ArrayOfHeaderDetail createArrayOfHeaderDetail() {
        return new ArrayOfHeaderDetail();
    }

    /**
     * Create an instance of {@link GetCompletedConfigurationsResponse }
     * 
     */
    public GetCompletedConfigurationsResponse createGetCompletedConfigurationsResponse() {
        return new GetCompletedConfigurationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfConfigurationSummary }
     * 
     */
    public ArrayOfConfigurationSummary createArrayOfConfigurationSummary() {
        return new ArrayOfConfigurationSummary();
    }

    /**
     * Create an instance of {@link LoadConfiguration }
     * 
     */
    public LoadConfiguration createLoadConfiguration() {
        return new LoadConfiguration();
    }

    /**
     * Create an instance of {@link LoadConfigurationResponse }
     * 
     */
    public LoadConfigurationResponse createLoadConfigurationResponse() {
        return new LoadConfigurationResponse();
    }

    /**
     * Create an instance of {@link LoadAllConfigurations }
     * 
     */
    public LoadAllConfigurations createLoadAllConfigurations() {
        return new LoadAllConfigurations();
    }

    /**
     * Create an instance of {@link LoadAllConfigurationsResponse }
     * 
     */
    public LoadAllConfigurationsResponse createLoadAllConfigurationsResponse() {
        return new LoadAllConfigurationsResponse();
    }

    /**
     * Create an instance of {@link LoadFullConfiguration }
     * 
     */
    public LoadFullConfiguration createLoadFullConfiguration() {
        return new LoadFullConfiguration();
    }

    /**
     * Create an instance of {@link LoadFullConfigurationResponse }
     * 
     */
    public LoadFullConfigurationResponse createLoadFullConfigurationResponse() {
        return new LoadFullConfigurationResponse();
    }

    /**
     * Create an instance of {@link ConfigurationDto }
     * 
     */
    public ConfigurationDto createConfigurationDto() {
        return new ConfigurationDto();
    }

    /**
     * Create an instance of {@link BaseDto }
     * 
     */
    public BaseDto createBaseDto() {
        return new BaseDto();
    }

    /**
     * Create an instance of {@link ArrayOfBomComponentDto }
     * 
     */
    public ArrayOfBomComponentDto createArrayOfBomComponentDto() {
        return new ArrayOfBomComponentDto();
    }

    /**
     * Create an instance of {@link BomComponentDto }
     * 
     */
    public BomComponentDto createBomComponentDto() {
        return new BomComponentDto();
    }

    /**
     * Create an instance of {@link ArrayOfAttributeDto }
     * 
     */
    public ArrayOfAttributeDto createArrayOfAttributeDto() {
        return new ArrayOfAttributeDto();
    }

    /**
     * Create an instance of {@link AttributeDto }
     * 
     */
    public AttributeDto createAttributeDto() {
        return new AttributeDto();
    }

    /**
     * Create an instance of {@link ArrayOfMfgDetailDto }
     * 
     */
    public ArrayOfMfgDetailDto createArrayOfMfgDetailDto() {
        return new ArrayOfMfgDetailDto();
    }

    /**
     * Create an instance of {@link MfgDetailDto }
     * 
     */
    public MfgDetailDto createMfgDetailDto() {
        return new MfgDetailDto();
    }

    /**
     * Create an instance of {@link ArrayOfOperationDto }
     * 
     */
    public ArrayOfOperationDto createArrayOfOperationDto() {
        return new ArrayOfOperationDto();
    }

    /**
     * Create an instance of {@link OperationDto }
     * 
     */
    public OperationDto createOperationDto() {
        return new OperationDto();
    }

    /**
     * Create an instance of {@link ArrayOfWorkInstructionDto }
     * 
     */
    public ArrayOfWorkInstructionDto createArrayOfWorkInstructionDto() {
        return new ArrayOfWorkInstructionDto();
    }

    /**
     * Create an instance of {@link WorkInstructionDto }
     * 
     */
    public WorkInstructionDto createWorkInstructionDto() {
        return new WorkInstructionDto();
    }

    /**
     * Create an instance of {@link ArrayOfComponentDto }
     * 
     */
    public ArrayOfComponentDto createArrayOfComponentDto() {
        return new ArrayOfComponentDto();
    }

    /**
     * Create an instance of {@link ComponentDto }
     * 
     */
    public ComponentDto createComponentDto() {
        return new ComponentDto();
    }

    /**
     * Create an instance of {@link ArrayOfComponentAttributeDto }
     * 
     */
    public ArrayOfComponentAttributeDto createArrayOfComponentAttributeDto() {
        return new ArrayOfComponentAttributeDto();
    }

    /**
     * Create an instance of {@link ComponentAttributeDto }
     * 
     */
    public ComponentAttributeDto createComponentAttributeDto() {
        return new ComponentAttributeDto();
    }

    /**
     * Create an instance of {@link ArrayOfDetailDto }
     * 
     */
    public ArrayOfDetailDto createArrayOfDetailDto() {
        return new ArrayOfDetailDto();
    }

    /**
     * Create an instance of {@link DetailDto }
     * 
     */
    public DetailDto createDetailDto() {
        return new DetailDto();
    }

    /**
     * Create an instance of {@link ArrayOfIntegrationOutputDto }
     * 
     */
    public ArrayOfIntegrationOutputDto createArrayOfIntegrationOutputDto() {
        return new ArrayOfIntegrationOutputDto();
    }

    /**
     * Create an instance of {@link IntegrationOutputDto }
     * 
     */
    public IntegrationOutputDto createIntegrationOutputDto() {
        return new IntegrationOutputDto();
    }

    /**
     * Create an instance of {@link ArrayOfIntegrationOutputAttributeDto }
     * 
     */
    public ArrayOfIntegrationOutputAttributeDto createArrayOfIntegrationOutputAttributeDto() {
        return new ArrayOfIntegrationOutputAttributeDto();
    }

    /**
     * Create an instance of {@link IntegrationOutputAttributeDto }
     * 
     */
    public IntegrationOutputAttributeDto createIntegrationOutputAttributeDto() {
        return new IntegrationOutputAttributeDto();
    }

    /**
     * Create an instance of {@link ArrayOfPageDto }
     * 
     */
    public ArrayOfPageDto createArrayOfPageDto() {
        return new ArrayOfPageDto();
    }

    /**
     * Create an instance of {@link PageDto }
     * 
     */
    public PageDto createPageDto() {
        return new PageDto();
    }

    /**
     * Create an instance of {@link ArrayOfScreenDto }
     * 
     */
    public ArrayOfScreenDto createArrayOfScreenDto() {
        return new ArrayOfScreenDto();
    }

    /**
     * Create an instance of {@link ScreenDto }
     * 
     */
    public ScreenDto createScreenDto() {
        return new ScreenDto();
    }

    /**
     * Create an instance of {@link ArrayOfScreenOptionDto }
     * 
     */
    public ArrayOfScreenOptionDto createArrayOfScreenOptionDto() {
        return new ArrayOfScreenOptionDto();
    }

    /**
     * Create an instance of {@link ScreenOptionDto }
     * 
     */
    public ScreenOptionDto createScreenOptionDto() {
        return new ScreenOptionDto();
    }

    /**
     * Create an instance of {@link GetContent }
     * 
     */
    public GetContent createGetContent() {
        return new GetContent();
    }

    /**
     * Create an instance of {@link GetContentResponse }
     * 
     */
    public GetContentResponse createGetContentResponse() {
        return new GetContentResponse();
    }

    /**
     * Create an instance of {@link FileContentDto }
     * 
     */
    public FileContentDto createFileContentDto() {
        return new FileContentDto();
    }

    /**
     * Create an instance of {@link GetDynamicContent }
     * 
     */
    public GetDynamicContent createGetDynamicContent() {
        return new GetDynamicContent();
    }

    /**
     * Create an instance of {@link GetDynamicContentResponse }
     * 
     */
    public GetDynamicContentResponse createGetDynamicContentResponse() {
        return new GetDynamicContentResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFileContentDto }
     * 
     */
    public ArrayOfFileContentDto createArrayOfFileContentDto() {
        return new ArrayOfFileContentDto();
    }

    /**
     * Create an instance of {@link CopyConfiguration }
     * 
     */
    public CopyConfiguration createCopyConfiguration() {
        return new CopyConfiguration();
    }

    /**
     * Create an instance of {@link CopyConfigurationResponse }
     * 
     */
    public CopyConfigurationResponse createCopyConfigurationResponse() {
        return new CopyConfigurationResponse();
    }

    /**
     * Create an instance of {@link CopyAllConfigurations }
     * 
     */
    public CopyAllConfigurations createCopyAllConfigurations() {
        return new CopyAllConfigurations();
    }

    /**
     * Create an instance of {@link CopyAllConfigurationsResponse }
     * 
     */
    public CopyAllConfigurationsResponse createCopyAllConfigurationsResponse() {
        return new CopyAllConfigurationsResponse();
    }

    /**
     * Create an instance of {@link DeleteConfiguration }
     * 
     */
    public DeleteConfiguration createDeleteConfiguration() {
        return new DeleteConfiguration();
    }

    /**
     * Create an instance of {@link DeleteConfigurationResponse }
     * 
     */
    public DeleteConfigurationResponse createDeleteConfigurationResponse() {
        return new DeleteConfigurationResponse();
    }

    /**
     * Create an instance of {@link DeleteAllConfigurations }
     * 
     */
    public DeleteAllConfigurations createDeleteAllConfigurations() {
        return new DeleteAllConfigurations();
    }

    /**
     * Create an instance of {@link DeleteAllConfigurationsResponse }
     * 
     */
    public DeleteAllConfigurationsResponse createDeleteAllConfigurationsResponse() {
        return new DeleteAllConfigurationsResponse();
    }

    /**
     * Create an instance of {@link PrepareForInteractiveConfiguration }
     * 
     */
    public PrepareForInteractiveConfiguration createPrepareForInteractiveConfiguration() {
        return new PrepareForInteractiveConfiguration();
    }

    /**
     * Create an instance of {@link PrepareForInteractiveConfigurationResponse }
     * 
     */
    public PrepareForInteractiveConfigurationResponse createPrepareForInteractiveConfigurationResponse() {
        return new PrepareForInteractiveConfigurationResponse();
    }

    /**
     * Create an instance of {@link SetInProgressInputParameters }
     * 
     */
    public SetInProgressInputParameters createSetInProgressInputParameters() {
        return new SetInProgressInputParameters();
    }

    /**
     * Create an instance of {@link SetInProgressInputParametersResponse }
     * 
     */
    public SetInProgressInputParametersResponse createSetInProgressInputParametersResponse() {
        return new SetInProgressInputParametersResponse();
    }

    /**
     * Create an instance of {@link GetInteractiveUrl }
     * 
     */
    public GetInteractiveUrl createGetInteractiveUrl() {
        return new GetInteractiveUrl();
    }

    /**
     * Create an instance of {@link GetInteractiveUrlResponse }
     * 
     */
    public GetInteractiveUrlResponse createGetInteractiveUrlResponse() {
        return new GetInteractiveUrlResponse();
    }

    /**
     * Create an instance of {@link FinishInteractiveConfiguration }
     * 
     */
    public FinishInteractiveConfiguration createFinishInteractiveConfiguration() {
        return new FinishInteractiveConfiguration();
    }

    /**
     * Create an instance of {@link FinishInteractiveConfigurationResponse }
     * 
     */
    public FinishInteractiveConfigurationResponse createFinishInteractiveConfigurationResponse() {
        return new FinishInteractiveConfigurationResponse();
    }

    /**
     * Create an instance of {@link ExecuteExtension }
     * 
     */
    public ExecuteExtension createExecuteExtension() {
        return new ExecuteExtension();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ExecuteExtensionResponse }
     * 
     */
    public ExecuteExtensionResponse createExecuteExtensionResponse() {
        return new ExecuteExtensionResponse();
    }

    /**
     * Create an instance of {@link ExportConfiguration }
     * 
     */
    public ExportConfiguration createExportConfiguration() {
        return new ExportConfiguration();
    }

    /**
     * Create an instance of {@link ExportConfigurationResponse }
     * 
     */
    public ExportConfigurationResponse createExportConfigurationResponse() {
        return new ExportConfigurationResponse();
    }

    /**
     * Create an instance of {@link ImportConfiguration }
     * 
     */
    public ImportConfiguration createImportConfiguration() {
        return new ImportConfiguration();
    }

    /**
     * Create an instance of {@link ImportConfigurationResponse }
     * 
     */
    public ImportConfigurationResponse createImportConfigurationResponse() {
        return new ImportConfigurationResponse();
    }

    /**
     * Create an instance of {@link QueueConfiguration }
     * 
     */
    public QueueConfiguration createQueueConfiguration() {
        return new QueueConfiguration();
    }

    /**
     * Create an instance of {@link QueueConfigurationResponse }
     * 
     */
    public QueueConfigurationResponse createQueueConfigurationResponse() {
        return new QueueConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetQueuedStatus }
     * 
     */
    public GetQueuedStatus createGetQueuedStatus() {
        return new GetQueuedStatus();
    }

    /**
     * Create an instance of {@link GetQueuedStatusResponse }
     * 
     */
    public GetQueuedStatusResponse createGetQueuedStatusResponse() {
        return new GetQueuedStatusResponse();
    }

    /**
     * Create an instance of {@link SetMfgTemplate }
     * 
     */
    public SetMfgTemplate createSetMfgTemplate() {
        return new SetMfgTemplate();
    }

    /**
     * Create an instance of {@link ArrayOfMfgTemplateAttribute }
     * 
     */
    public ArrayOfMfgTemplateAttribute createArrayOfMfgTemplateAttribute() {
        return new ArrayOfMfgTemplateAttribute();
    }

    /**
     * Create an instance of {@link MfgTemplateAttribute }
     * 
     */
    public MfgTemplateAttribute createMfgTemplateAttribute() {
        return new MfgTemplateAttribute();
    }

    /**
     * Create an instance of {@link SetMfgTemplateResponse }
     * 
     */
    public SetMfgTemplateResponse createSetMfgTemplateResponse() {
        return new SetMfgTemplateResponse();
    }

    /**
     * Create an instance of {@link SetIntegrationTemplate }
     * 
     */
    public SetIntegrationTemplate createSetIntegrationTemplate() {
        return new SetIntegrationTemplate();
    }

    /**
     * Create an instance of {@link ArrayOfIntegrationTemplateAttribute }
     * 
     */
    public ArrayOfIntegrationTemplateAttribute createArrayOfIntegrationTemplateAttribute() {
        return new ArrayOfIntegrationTemplateAttribute();
    }

    /**
     * Create an instance of {@link IntegrationTemplateAttribute }
     * 
     */
    public IntegrationTemplateAttribute createIntegrationTemplateAttribute() {
        return new IntegrationTemplateAttribute();
    }

    /**
     * Create an instance of {@link SetIntegrationTemplateResponse }
     * 
     */
    public SetIntegrationTemplateResponse createSetIntegrationTemplateResponse() {
        return new SetIntegrationTemplateResponse();
    }

    /**
     * Create an instance of {@link DeleteIntegrationTemplate }
     * 
     */
    public DeleteIntegrationTemplate createDeleteIntegrationTemplate() {
        return new DeleteIntegrationTemplate();
    }

    /**
     * Create an instance of {@link DeleteIntegrationTemplateResponse }
     * 
     */
    public DeleteIntegrationTemplateResponse createDeleteIntegrationTemplateResponse() {
        return new DeleteIntegrationTemplateResponse();
    }

    /**
     * Create an instance of {@link LoadIntegrationOutputData }
     * 
     */
    public LoadIntegrationOutputData createLoadIntegrationOutputData() {
        return new LoadIntegrationOutputData();
    }

    /**
     * Create an instance of {@link LoadIntegrationOutputDataResponse }
     * 
     */
    public LoadIntegrationOutputDataResponse createLoadIntegrationOutputDataResponse() {
        return new LoadIntegrationOutputDataResponse();
    }

    /**
     * Create an instance of {@link LoadMfgData }
     * 
     */
    public LoadMfgData createLoadMfgData() {
        return new LoadMfgData();
    }

    /**
     * Create an instance of {@link LoadMfgDataResponse }
     * 
     */
    public LoadMfgDataResponse createLoadMfgDataResponse() {
        return new LoadMfgDataResponse();
    }

    /**
     * Create an instance of {@link SetPredefinedComponentAttribute }
     * 
     */
    public SetPredefinedComponentAttribute createSetPredefinedComponentAttribute() {
        return new SetPredefinedComponentAttribute();
    }

    /**
     * Create an instance of {@link PredefinedComponentAttribute }
     * 
     */
    public PredefinedComponentAttribute createPredefinedComponentAttribute() {
        return new PredefinedComponentAttribute();
    }

    /**
     * Create an instance of {@link SetPredefinedComponentAttributeResponse }
     * 
     */
    public SetPredefinedComponentAttributeResponse createSetPredefinedComponentAttributeResponse() {
        return new SetPredefinedComponentAttributeResponse();
    }

    /**
     * Create an instance of {@link DeletePredefinedComponentAttribute }
     * 
     */
    public DeletePredefinedComponentAttribute createDeletePredefinedComponentAttribute() {
        return new DeletePredefinedComponentAttribute();
    }

    /**
     * Create an instance of {@link DeletePredefinedComponentAttributeResponse }
     * 
     */
    public DeletePredefinedComponentAttributeResponse createDeletePredefinedComponentAttributeResponse() {
        return new DeletePredefinedComponentAttributeResponse();
    }

    /**
     * Create an instance of {@link LoadComponentData }
     * 
     */
    public LoadComponentData createLoadComponentData() {
        return new LoadComponentData();
    }

    /**
     * Create an instance of {@link LoadComponentDataResponse }
     * 
     */
    public LoadComponentDataResponse createLoadComponentDataResponse() {
        return new LoadComponentDataResponse();
    }

    /**
     * Create an instance of {@link LoadUIData }
     * 
     */
    public LoadUIData createLoadUIData() {
        return new LoadUIData();
    }

    /**
     * Create an instance of {@link LoadUIDataResponse }
     * 
     */
    public LoadUIDataResponse createLoadUIDataResponse() {
        return new LoadUIDataResponse();
    }

    /**
     * Create an instance of {@link LoadInprogressInputParameters }
     * 
     */
    public LoadInprogressInputParameters createLoadInprogressInputParameters() {
        return new LoadInprogressInputParameters();
    }

    /**
     * Create an instance of {@link LoadInprogressInputParametersResponse }
     * 
     */
    public LoadInprogressInputParametersResponse createLoadInprogressInputParametersResponse() {
        return new LoadInprogressInputParametersResponse();
    }

    /**
     * Create an instance of {@link GetApplications }
     * 
     */
    public GetApplications createGetApplications() {
        return new GetApplications();
    }

    /**
     * Create an instance of {@link GetApplicationsResponse }
     * 
     */
    public GetApplicationsResponse createGetApplicationsResponse() {
        return new GetApplicationsResponse();
    }

    /**
     * Create an instance of {@link Exists }
     * 
     */
    public Exists createExists() {
        return new Exists();
    }

    /**
     * Create an instance of {@link ExistsResponse }
     * 
     */
    public ExistsResponse createExistsResponse() {
        return new ExistsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "InputParameters")
    public JAXBElement<InputParameters> createInputParameters(InputParameters value) {
        return new JAXBElement<InputParameters>(_InputParameters_QNAME, InputParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "Application")
    public JAXBElement<Application> createApplication(Application value) {
        return new JAXBElement<Application>(_Application_QNAME, Application.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "HeaderDetail")
    public JAXBElement<HeaderDetail> createHeaderDetail(HeaderDetail value) {
        return new JAXBElement<HeaderDetail>(_HeaderDetail_QNAME, HeaderDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationParameter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationParameter }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfIntegrationParameter")
    public JAXBElement<ArrayOfIntegrationParameter> createArrayOfIntegrationParameter(ArrayOfIntegrationParameter value) {
        return new JAXBElement<ArrayOfIntegrationParameter>(_ArrayOfIntegrationParameter_QNAME, ArrayOfIntegrationParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationParameter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntegrationParameter }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "IntegrationParameter")
    public JAXBElement<IntegrationParameter> createIntegrationParameter(IntegrationParameter value) {
        return new JAXBElement<IntegrationParameter>(_IntegrationParameter_QNAME, IntegrationParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parameter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Parameter }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "Parameter")
    public JAXBElement<Parameter> createParameter(Parameter value) {
        return new JAXBElement<Parameter>(_Parameter_QNAME, Parameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "DataType")
    public JAXBElement<DataType> createDataType(DataType value) {
        return new JAXBElement<DataType>(_DataType_QNAME, DataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationMode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfigurationMode }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ConfigurationMode")
    public JAXBElement<ConfigurationMode> createConfigurationMode(ConfigurationMode value) {
        return new JAXBElement<ConfigurationMode>(_ConfigurationMode_QNAME, ConfigurationMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Part }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Part }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "Part")
    public JAXBElement<Part> createPart(Part value) {
        return new JAXBElement<Part>(_Part_QNAME, Part.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRapidOption }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRapidOption }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfRapidOption")
    public JAXBElement<ArrayOfRapidOption> createArrayOfRapidOption(ArrayOfRapidOption value) {
        return new JAXBElement<ArrayOfRapidOption>(_ArrayOfRapidOption_QNAME, ArrayOfRapidOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RapidOption }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RapidOption }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "RapidOption")
    public JAXBElement<RapidOption> createRapidOption(RapidOption value) {
        return new JAXBElement<RapidOption>(_RapidOption_QNAME, RapidOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationSummary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfigurationSummary }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ConfigurationSummary")
    public JAXBElement<ConfigurationSummary> createConfigurationSummary(ConfigurationSummary value) {
        return new JAXBElement<ConfigurationSummary>(_ConfigurationSummary_QNAME, ConfigurationSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommitParameter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCommitParameter }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfCommitParameter")
    public JAXBElement<ArrayOfCommitParameter> createArrayOfCommitParameter(ArrayOfCommitParameter value) {
        return new JAXBElement<ArrayOfCommitParameter>(_ArrayOfCommitParameter_QNAME, ArrayOfCommitParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitParameter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CommitParameter }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "CommitParameter")
    public JAXBElement<CommitParameter> createCommitParameter(CommitParameter value) {
        return new JAXBElement<CommitParameter>(_CommitParameter_QNAME, CommitParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfDetail")
    public JAXBElement<ArrayOfDetail> createArrayOfDetail(ArrayOfDetail value) {
        return new JAXBElement<ArrayOfDetail>(_ArrayOfDetail_QNAME, ArrayOfDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Detail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Detail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "Detail")
    public JAXBElement<Detail> createDetail(Detail value) {
        return new JAXBElement<Detail>(_Detail_QNAME, Detail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetailType }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "DetailType")
    public JAXBElement<DetailType> createDetailType(DetailType value) {
        return new JAXBElement<DetailType>(_DetailType_QNAME, DetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfigurationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ConfigurationResult")
    public JAXBElement<ConfigurationResult> createConfigurationResult(ConfigurationResult value) {
        return new JAXBElement<ConfigurationResult>(_ConfigurationResult_QNAME, ConfigurationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSummaryDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSummaryDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfSummaryDetail")
    public JAXBElement<ArrayOfSummaryDetail> createArrayOfSummaryDetail(ArrayOfSummaryDetail value) {
        return new JAXBElement<ArrayOfSummaryDetail>(_ArrayOfSummaryDetail_QNAME, ArrayOfSummaryDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummaryDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SummaryDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "SummaryDetail")
    public JAXBElement<SummaryDetail> createSummaryDetail(SummaryDetail value) {
        return new JAXBElement<SummaryDetail>(_SummaryDetail_QNAME, SummaryDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInputParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfInputParameters }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfInputParameters")
    public JAXBElement<ArrayOfInputParameters> createArrayOfInputParameters(ArrayOfInputParameters value) {
        return new JAXBElement<ArrayOfInputParameters>(_ArrayOfInputParameters_QNAME, ArrayOfInputParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfHeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfHeaderDetail")
    public JAXBElement<ArrayOfHeaderDetail> createArrayOfHeaderDetail(ArrayOfHeaderDetail value) {
        return new JAXBElement<ArrayOfHeaderDetail>(_ArrayOfHeaderDetail_QNAME, ArrayOfHeaderDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConfigurationSummary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfConfigurationSummary }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfConfigurationSummary")
    public JAXBElement<ArrayOfConfigurationSummary> createArrayOfConfigurationSummary(ArrayOfConfigurationSummary value) {
        return new JAXBElement<ArrayOfConfigurationSummary>(_ArrayOfConfigurationSummary_QNAME, ArrayOfConfigurationSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfigurationDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ConfigurationDto")
    public JAXBElement<ConfigurationDto> createConfigurationDto(ConfigurationDto value) {
        return new JAXBElement<ConfigurationDto>(_ConfigurationDto_QNAME, ConfigurationDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaseDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "BaseDto")
    public JAXBElement<BaseDto> createBaseDto(BaseDto value) {
        return new JAXBElement<BaseDto>(_BaseDto_QNAME, BaseDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBomComponentDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBomComponentDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfBomComponentDto")
    public JAXBElement<ArrayOfBomComponentDto> createArrayOfBomComponentDto(ArrayOfBomComponentDto value) {
        return new JAXBElement<ArrayOfBomComponentDto>(_ArrayOfBomComponentDto_QNAME, ArrayOfBomComponentDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BomComponentDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BomComponentDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "BomComponentDto")
    public JAXBElement<BomComponentDto> createBomComponentDto(BomComponentDto value) {
        return new JAXBElement<BomComponentDto>(_BomComponentDto_QNAME, BomComponentDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfAttributeDto")
    public JAXBElement<ArrayOfAttributeDto> createArrayOfAttributeDto(ArrayOfAttributeDto value) {
        return new JAXBElement<ArrayOfAttributeDto>(_ArrayOfAttributeDto_QNAME, ArrayOfAttributeDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttributeDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "AttributeDto")
    public JAXBElement<AttributeDto> createAttributeDto(AttributeDto value) {
        return new JAXBElement<AttributeDto>(_AttributeDto_QNAME, AttributeDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMfgDetailDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMfgDetailDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfMfgDetailDto")
    public JAXBElement<ArrayOfMfgDetailDto> createArrayOfMfgDetailDto(ArrayOfMfgDetailDto value) {
        return new JAXBElement<ArrayOfMfgDetailDto>(_ArrayOfMfgDetailDto_QNAME, ArrayOfMfgDetailDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MfgDetailDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MfgDetailDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "MfgDetailDto")
    public JAXBElement<MfgDetailDto> createMfgDetailDto(MfgDetailDto value) {
        return new JAXBElement<MfgDetailDto>(_MfgDetailDto_QNAME, MfgDetailDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfOperationDto")
    public JAXBElement<ArrayOfOperationDto> createArrayOfOperationDto(ArrayOfOperationDto value) {
        return new JAXBElement<ArrayOfOperationDto>(_ArrayOfOperationDto_QNAME, ArrayOfOperationDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperationDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "OperationDto")
    public JAXBElement<OperationDto> createOperationDto(OperationDto value) {
        return new JAXBElement<OperationDto>(_OperationDto_QNAME, OperationDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkInstructionDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkInstructionDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfWorkInstructionDto")
    public JAXBElement<ArrayOfWorkInstructionDto> createArrayOfWorkInstructionDto(ArrayOfWorkInstructionDto value) {
        return new JAXBElement<ArrayOfWorkInstructionDto>(_ArrayOfWorkInstructionDto_QNAME, ArrayOfWorkInstructionDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkInstructionDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkInstructionDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "WorkInstructionDto")
    public JAXBElement<WorkInstructionDto> createWorkInstructionDto(WorkInstructionDto value) {
        return new JAXBElement<WorkInstructionDto>(_WorkInstructionDto_QNAME, WorkInstructionDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfComponentDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfComponentDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfComponentDto")
    public JAXBElement<ArrayOfComponentDto> createArrayOfComponentDto(ArrayOfComponentDto value) {
        return new JAXBElement<ArrayOfComponentDto>(_ArrayOfComponentDto_QNAME, ArrayOfComponentDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponentDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ComponentDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ComponentDto")
    public JAXBElement<ComponentDto> createComponentDto(ComponentDto value) {
        return new JAXBElement<ComponentDto>(_ComponentDto_QNAME, ComponentDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfComponentAttributeDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfComponentAttributeDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfComponentAttributeDto")
    public JAXBElement<ArrayOfComponentAttributeDto> createArrayOfComponentAttributeDto(ArrayOfComponentAttributeDto value) {
        return new JAXBElement<ArrayOfComponentAttributeDto>(_ArrayOfComponentAttributeDto_QNAME, ArrayOfComponentAttributeDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponentAttributeDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ComponentAttributeDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ComponentAttributeDto")
    public JAXBElement<ComponentAttributeDto> createComponentAttributeDto(ComponentAttributeDto value) {
        return new JAXBElement<ComponentAttributeDto>(_ComponentAttributeDto_QNAME, ComponentAttributeDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetailDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetailDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfDetailDto")
    public JAXBElement<ArrayOfDetailDto> createArrayOfDetailDto(ArrayOfDetailDto value) {
        return new JAXBElement<ArrayOfDetailDto>(_ArrayOfDetailDto_QNAME, ArrayOfDetailDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetailDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "DetailDto")
    public JAXBElement<DetailDto> createDetailDto(DetailDto value) {
        return new JAXBElement<DetailDto>(_DetailDto_QNAME, DetailDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationOutputDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationOutputDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfIntegrationOutputDto")
    public JAXBElement<ArrayOfIntegrationOutputDto> createArrayOfIntegrationOutputDto(ArrayOfIntegrationOutputDto value) {
        return new JAXBElement<ArrayOfIntegrationOutputDto>(_ArrayOfIntegrationOutputDto_QNAME, ArrayOfIntegrationOutputDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationOutputDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntegrationOutputDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "IntegrationOutputDto")
    public JAXBElement<IntegrationOutputDto> createIntegrationOutputDto(IntegrationOutputDto value) {
        return new JAXBElement<IntegrationOutputDto>(_IntegrationOutputDto_QNAME, IntegrationOutputDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationOutputAttributeDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationOutputAttributeDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfIntegrationOutputAttributeDto")
    public JAXBElement<ArrayOfIntegrationOutputAttributeDto> createArrayOfIntegrationOutputAttributeDto(ArrayOfIntegrationOutputAttributeDto value) {
        return new JAXBElement<ArrayOfIntegrationOutputAttributeDto>(_ArrayOfIntegrationOutputAttributeDto_QNAME, ArrayOfIntegrationOutputAttributeDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationOutputAttributeDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntegrationOutputAttributeDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "IntegrationOutputAttributeDto")
    public JAXBElement<IntegrationOutputAttributeDto> createIntegrationOutputAttributeDto(IntegrationOutputAttributeDto value) {
        return new JAXBElement<IntegrationOutputAttributeDto>(_IntegrationOutputAttributeDto_QNAME, IntegrationOutputAttributeDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPageDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPageDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfPageDto")
    public JAXBElement<ArrayOfPageDto> createArrayOfPageDto(ArrayOfPageDto value) {
        return new JAXBElement<ArrayOfPageDto>(_ArrayOfPageDto_QNAME, ArrayOfPageDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PageDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "PageDto")
    public JAXBElement<PageDto> createPageDto(PageDto value) {
        return new JAXBElement<PageDto>(_PageDto_QNAME, PageDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfScreenDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfScreenDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfScreenDto")
    public JAXBElement<ArrayOfScreenDto> createArrayOfScreenDto(ArrayOfScreenDto value) {
        return new JAXBElement<ArrayOfScreenDto>(_ArrayOfScreenDto_QNAME, ArrayOfScreenDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreenDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScreenDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ScreenDto")
    public JAXBElement<ScreenDto> createScreenDto(ScreenDto value) {
        return new JAXBElement<ScreenDto>(_ScreenDto_QNAME, ScreenDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfScreenOptionDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfScreenOptionDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfScreenOptionDto")
    public JAXBElement<ArrayOfScreenOptionDto> createArrayOfScreenOptionDto(ArrayOfScreenOptionDto value) {
        return new JAXBElement<ArrayOfScreenOptionDto>(_ArrayOfScreenOptionDto_QNAME, ArrayOfScreenOptionDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreenOptionDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScreenOptionDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ScreenOptionDto")
    public JAXBElement<ScreenOptionDto> createScreenOptionDto(ScreenOptionDto value) {
        return new JAXBElement<ScreenOptionDto>(_ScreenOptionDto_QNAME, ScreenOptionDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileContentDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileContentDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "FileContentDto")
    public JAXBElement<FileContentDto> createFileContentDto(FileContentDto value) {
        return new JAXBElement<FileContentDto>(_FileContentDto_QNAME, FileContentDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFileContentDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFileContentDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfFileContentDto")
    public JAXBElement<ArrayOfFileContentDto> createArrayOfFileContentDto(ArrayOfFileContentDto value) {
        return new JAXBElement<ArrayOfFileContentDto>(_ArrayOfFileContentDto_QNAME, ArrayOfFileContentDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueueStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueueStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "QueueStatus")
    public JAXBElement<QueueStatus> createQueueStatus(QueueStatus value) {
        return new JAXBElement<QueueStatus>(_QueueStatus_QNAME, QueueStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMfgTemplateAttribute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMfgTemplateAttribute }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfMfgTemplateAttribute")
    public JAXBElement<ArrayOfMfgTemplateAttribute> createArrayOfMfgTemplateAttribute(ArrayOfMfgTemplateAttribute value) {
        return new JAXBElement<ArrayOfMfgTemplateAttribute>(_ArrayOfMfgTemplateAttribute_QNAME, ArrayOfMfgTemplateAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MfgTemplateAttribute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MfgTemplateAttribute }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "MfgTemplateAttribute")
    public JAXBElement<MfgTemplateAttribute> createMfgTemplateAttribute(MfgTemplateAttribute value) {
        return new JAXBElement<MfgTemplateAttribute>(_MfgTemplateAttribute_QNAME, MfgTemplateAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationTemplateAttribute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationTemplateAttribute }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ArrayOfIntegrationTemplateAttribute")
    public JAXBElement<ArrayOfIntegrationTemplateAttribute> createArrayOfIntegrationTemplateAttribute(ArrayOfIntegrationTemplateAttribute value) {
        return new JAXBElement<ArrayOfIntegrationTemplateAttribute>(_ArrayOfIntegrationTemplateAttribute_QNAME, ArrayOfIntegrationTemplateAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationTemplateAttribute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntegrationTemplateAttribute }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "IntegrationTemplateAttribute")
    public JAXBElement<IntegrationTemplateAttribute> createIntegrationTemplateAttribute(IntegrationTemplateAttribute value) {
        return new JAXBElement<IntegrationTemplateAttribute>(_IntegrationTemplateAttribute_QNAME, IntegrationTemplateAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PredefinedComponentAttribute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PredefinedComponentAttribute }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "PredefinedComponentAttribute")
    public JAXBElement<PredefinedComponentAttribute> createPredefinedComponentAttribute(PredefinedComponentAttribute value) {
        return new JAXBElement<PredefinedComponentAttribute>(_PredefinedComponentAttribute_QNAME, PredefinedComponentAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "inputParameters", scope = Configure.class)
    public JAXBElement<InputParameters> createConfigureInputParameters(InputParameters value) {
        return new JAXBElement<InputParameters>(_ConfigureInputParameters_QNAME, InputParameters.class, Configure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationSummary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfigurationSummary }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ConfigureResult", scope = ConfigureResponse.class)
    public JAXBElement<ConfigurationSummary> createConfigureResponseConfigureResult(ConfigurationSummary value) {
        return new JAXBElement<ConfigurationSummary>(_ConfigureResponseConfigureResult_QNAME, ConfigurationSummary.class, ConfigureResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "inputParameters", scope = BeginConfigure.class)
    public JAXBElement<InputParameters> createBeginConfigureInputParameters(InputParameters value) {
        return new JAXBElement<InputParameters>(_ConfigureInputParameters_QNAME, InputParameters.class, BeginConfigure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInputParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfInputParameters }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "inputParameters", scope = BeginConfigureMany.class)
    public JAXBElement<ArrayOfInputParameters> createBeginConfigureManyInputParameters(ArrayOfInputParameters value) {
        return new JAXBElement<ArrayOfInputParameters>(_ConfigureInputParameters_QNAME, ArrayOfInputParameters.class, BeginConfigureMany.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = GetCompletedConfigurations.class)
    public JAXBElement<Application> createGetCompletedConfigurationsApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, GetCompletedConfigurations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfHeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "headerDetails", scope = GetCompletedConfigurations.class)
    public JAXBElement<ArrayOfHeaderDetail> createGetCompletedConfigurationsHeaderDetails(ArrayOfHeaderDetail value) {
        return new JAXBElement<ArrayOfHeaderDetail>(_GetCompletedConfigurationsHeaderDetails_QNAME, ArrayOfHeaderDetail.class, GetCompletedConfigurations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConfigurationSummary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfConfigurationSummary }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "GetCompletedConfigurationsResult", scope = GetCompletedConfigurationsResponse.class)
    public JAXBElement<ArrayOfConfigurationSummary> createGetCompletedConfigurationsResponseGetCompletedConfigurationsResult(ArrayOfConfigurationSummary value) {
        return new JAXBElement<ArrayOfConfigurationSummary>(_GetCompletedConfigurationsResponseGetCompletedConfigurationsResult_QNAME, ArrayOfConfigurationSummary.class, GetCompletedConfigurationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = LoadConfiguration.class)
    public JAXBElement<Application> createLoadConfigurationApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, LoadConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "headerDetail", scope = LoadConfiguration.class)
    public JAXBElement<HeaderDetail> createLoadConfigurationHeaderDetail(HeaderDetail value) {
        return new JAXBElement<HeaderDetail>(_LoadConfigurationHeaderDetail_QNAME, HeaderDetail.class, LoadConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationSummary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfigurationSummary }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "LoadConfigurationResult", scope = LoadConfigurationResponse.class)
    public JAXBElement<ConfigurationSummary> createLoadConfigurationResponseLoadConfigurationResult(ConfigurationSummary value) {
        return new JAXBElement<ConfigurationSummary>(_LoadConfigurationResponseLoadConfigurationResult_QNAME, ConfigurationSummary.class, LoadConfigurationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = LoadAllConfigurations.class)
    public JAXBElement<Application> createLoadAllConfigurationsApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, LoadAllConfigurations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "headerId", scope = LoadAllConfigurations.class)
    public JAXBElement<String> createLoadAllConfigurationsHeaderId(String value) {
        return new JAXBElement<String>(_LoadAllConfigurationsHeaderId_QNAME, String.class, LoadAllConfigurations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConfigurationSummary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfConfigurationSummary }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "LoadAllConfigurationsResult", scope = LoadAllConfigurationsResponse.class)
    public JAXBElement<ArrayOfConfigurationSummary> createLoadAllConfigurationsResponseLoadAllConfigurationsResult(ArrayOfConfigurationSummary value) {
        return new JAXBElement<ArrayOfConfigurationSummary>(_LoadAllConfigurationsResponseLoadAllConfigurationsResult_QNAME, ArrayOfConfigurationSummary.class, LoadAllConfigurationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = LoadFullConfiguration.class)
    public JAXBElement<Application> createLoadFullConfigurationApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, LoadFullConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "headerDetail", scope = LoadFullConfiguration.class)
    public JAXBElement<HeaderDetail> createLoadFullConfigurationHeaderDetail(HeaderDetail value) {
        return new JAXBElement<HeaderDetail>(_LoadConfigurationHeaderDetail_QNAME, HeaderDetail.class, LoadFullConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfigurationDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "LoadFullConfigurationResult", scope = LoadFullConfigurationResponse.class)
    public JAXBElement<ConfigurationDto> createLoadFullConfigurationResponseLoadFullConfigurationResult(ConfigurationDto value) {
        return new JAXBElement<ConfigurationDto>(_LoadFullConfigurationResponseLoadFullConfigurationResult_QNAME, ConfigurationDto.class, LoadFullConfigurationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = GetContent.class)
    public JAXBElement<Application> createGetContentApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, GetContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "url", scope = GetContent.class)
    public JAXBElement<String> createGetContentUrl(String value) {
        return new JAXBElement<String>(_GetContentUrl_QNAME, String.class, GetContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileContentDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileContentDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "GetContentResult", scope = GetContentResponse.class)
    public JAXBElement<FileContentDto> createGetContentResponseGetContentResult(FileContentDto value) {
        return new JAXBElement<FileContentDto>(_GetContentResponseGetContentResult_QNAME, FileContentDto.class, GetContentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = GetDynamicContent.class)
    public JAXBElement<Application> createGetDynamicContentApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, GetDynamicContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "headerDetail", scope = GetDynamicContent.class)
    public JAXBElement<HeaderDetail> createGetDynamicContentHeaderDetail(HeaderDetail value) {
        return new JAXBElement<HeaderDetail>(_LoadConfigurationHeaderDetail_QNAME, HeaderDetail.class, GetDynamicContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFileContentDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFileContentDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "GetDynamicContentResult", scope = GetDynamicContentResponse.class)
    public JAXBElement<ArrayOfFileContentDto> createGetDynamicContentResponseGetDynamicContentResult(ArrayOfFileContentDto value) {
        return new JAXBElement<ArrayOfFileContentDto>(_GetDynamicContentResponseGetDynamicContentResult_QNAME, ArrayOfFileContentDto.class, GetDynamicContentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = CopyConfiguration.class)
    public JAXBElement<Application> createCopyConfigurationApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, CopyConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "source", scope = CopyConfiguration.class)
    public JAXBElement<HeaderDetail> createCopyConfigurationSource(HeaderDetail value) {
        return new JAXBElement<HeaderDetail>(_CopyConfigurationSource_QNAME, HeaderDetail.class, CopyConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "target", scope = CopyConfiguration.class)
    public JAXBElement<HeaderDetail> createCopyConfigurationTarget(HeaderDetail value) {
        return new JAXBElement<HeaderDetail>(_CopyConfigurationTarget_QNAME, HeaderDetail.class, CopyConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationSummary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfigurationSummary }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "CopyConfigurationResult", scope = CopyConfigurationResponse.class)
    public JAXBElement<ConfigurationSummary> createCopyConfigurationResponseCopyConfigurationResult(ConfigurationSummary value) {
        return new JAXBElement<ConfigurationSummary>(_CopyConfigurationResponseCopyConfigurationResult_QNAME, ConfigurationSummary.class, CopyConfigurationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = CopyAllConfigurations.class)
    public JAXBElement<Application> createCopyAllConfigurationsApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, CopyAllConfigurations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "sourceHeaderId", scope = CopyAllConfigurations.class)
    public JAXBElement<String> createCopyAllConfigurationsSourceHeaderId(String value) {
        return new JAXBElement<String>(_CopyAllConfigurationsSourceHeaderId_QNAME, String.class, CopyAllConfigurations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "targetHeaderId", scope = CopyAllConfigurations.class)
    public JAXBElement<String> createCopyAllConfigurationsTargetHeaderId(String value) {
        return new JAXBElement<String>(_CopyAllConfigurationsTargetHeaderId_QNAME, String.class, CopyAllConfigurations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConfigurationSummary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfConfigurationSummary }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "CopyAllConfigurationsResult", scope = CopyAllConfigurationsResponse.class)
    public JAXBElement<ArrayOfConfigurationSummary> createCopyAllConfigurationsResponseCopyAllConfigurationsResult(ArrayOfConfigurationSummary value) {
        return new JAXBElement<ArrayOfConfigurationSummary>(_CopyAllConfigurationsResponseCopyAllConfigurationsResult_QNAME, ArrayOfConfigurationSummary.class, CopyAllConfigurationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = DeleteConfiguration.class)
    public JAXBElement<Application> createDeleteConfigurationApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, DeleteConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "headerDetail", scope = DeleteConfiguration.class)
    public JAXBElement<HeaderDetail> createDeleteConfigurationHeaderDetail(HeaderDetail value) {
        return new JAXBElement<HeaderDetail>(_LoadConfigurationHeaderDetail_QNAME, HeaderDetail.class, DeleteConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = DeleteAllConfigurations.class)
    public JAXBElement<Application> createDeleteAllConfigurationsApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, DeleteAllConfigurations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "headerId", scope = DeleteAllConfigurations.class)
    public JAXBElement<String> createDeleteAllConfigurationsHeaderId(String value) {
        return new JAXBElement<String>(_LoadAllConfigurationsHeaderId_QNAME, String.class, DeleteAllConfigurations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "inputParameters", scope = PrepareForInteractiveConfiguration.class)
    public JAXBElement<InputParameters> createPrepareForInteractiveConfigurationInputParameters(InputParameters value) {
        return new JAXBElement<InputParameters>(_ConfigureInputParameters_QNAME, InputParameters.class, PrepareForInteractiveConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "pageCaption", scope = PrepareForInteractiveConfiguration.class)
    public JAXBElement<String> createPrepareForInteractiveConfigurationPageCaption(String value) {
        return new JAXBElement<String>(_PrepareForInteractiveConfigurationPageCaption_QNAME, String.class, PrepareForInteractiveConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "redirectUrl", scope = PrepareForInteractiveConfiguration.class)
    public JAXBElement<String> createPrepareForInteractiveConfigurationRedirectUrl(String value) {
        return new JAXBElement<String>(_PrepareForInteractiveConfigurationRedirectUrl_QNAME, String.class, PrepareForInteractiveConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "PrepareForInteractiveConfigurationResult", scope = PrepareForInteractiveConfigurationResponse.class)
    public JAXBElement<String> createPrepareForInteractiveConfigurationResponsePrepareForInteractiveConfigurationResult(String value) {
        return new JAXBElement<String>(_PrepareForInteractiveConfigurationResponsePrepareForInteractiveConfigurationResult_QNAME, String.class, PrepareForInteractiveConfigurationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "inputParameters", scope = SetInProgressInputParameters.class)
    public JAXBElement<InputParameters> createSetInProgressInputParametersInputParameters(InputParameters value) {
        return new JAXBElement<InputParameters>(_ConfigureInputParameters_QNAME, InputParameters.class, SetInProgressInputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "inputParameters", scope = GetInteractiveUrl.class)
    public JAXBElement<InputParameters> createGetInteractiveUrlInputParameters(InputParameters value) {
        return new JAXBElement<InputParameters>(_ConfigureInputParameters_QNAME, InputParameters.class, GetInteractiveUrl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "pageCaption", scope = GetInteractiveUrl.class)
    public JAXBElement<String> createGetInteractiveUrlPageCaption(String value) {
        return new JAXBElement<String>(_PrepareForInteractiveConfigurationPageCaption_QNAME, String.class, GetInteractiveUrl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "redirectUrl", scope = GetInteractiveUrl.class)
    public JAXBElement<String> createGetInteractiveUrlRedirectUrl(String value) {
        return new JAXBElement<String>(_PrepareForInteractiveConfigurationRedirectUrl_QNAME, String.class, GetInteractiveUrl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "GetInteractiveUrlResult", scope = GetInteractiveUrlResponse.class)
    public JAXBElement<String> createGetInteractiveUrlResponseGetInteractiveUrlResult(String value) {
        return new JAXBElement<String>(_GetInteractiveUrlResponseGetInteractiveUrlResult_QNAME, String.class, GetInteractiveUrlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = FinishInteractiveConfiguration.class)
    public JAXBElement<Application> createFinishInteractiveConfigurationApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, FinishInteractiveConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "headerDetail", scope = FinishInteractiveConfiguration.class)
    public JAXBElement<HeaderDetail> createFinishInteractiveConfigurationHeaderDetail(HeaderDetail value) {
        return new JAXBElement<HeaderDetail>(_LoadConfigurationHeaderDetail_QNAME, HeaderDetail.class, FinishInteractiveConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationSummary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfigurationSummary }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "FinishInteractiveConfigurationResult", scope = FinishInteractiveConfigurationResponse.class)
    public JAXBElement<ConfigurationSummary> createFinishInteractiveConfigurationResponseFinishInteractiveConfigurationResult(ConfigurationSummary value) {
        return new JAXBElement<ConfigurationSummary>(_FinishInteractiveConfigurationResponseFinishInteractiveConfigurationResult_QNAME, ConfigurationSummary.class, FinishInteractiveConfigurationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = ExecuteExtension.class)
    public JAXBElement<Application> createExecuteExtensionApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, ExecuteExtension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "extensionName", scope = ExecuteExtension.class)
    public JAXBElement<String> createExecuteExtensionExtensionName(String value) {
        return new JAXBElement<String>(_ExecuteExtensionExtensionName_QNAME, String.class, ExecuteExtension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "parameters", scope = ExecuteExtension.class)
    public JAXBElement<ArrayOfstring> createExecuteExtensionParameters(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ExecuteExtensionParameters_QNAME, ArrayOfstring.class, ExecuteExtension.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ExecuteExtensionResult", scope = ExecuteExtensionResponse.class)
    public JAXBElement<String> createExecuteExtensionResponseExecuteExtensionResult(String value) {
        return new JAXBElement<String>(_ExecuteExtensionResponseExecuteExtensionResult_QNAME, String.class, ExecuteExtensionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = ExportConfiguration.class)
    public JAXBElement<Application> createExportConfigurationApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, ExportConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "headerDetail", scope = ExportConfiguration.class)
    public JAXBElement<HeaderDetail> createExportConfigurationHeaderDetail(HeaderDetail value) {
        return new JAXBElement<HeaderDetail>(_LoadConfigurationHeaderDetail_QNAME, HeaderDetail.class, ExportConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ExportConfigurationResult", scope = ExportConfigurationResponse.class)
    public JAXBElement<String> createExportConfigurationResponseExportConfigurationResult(String value) {
        return new JAXBElement<String>(_ExportConfigurationResponseExportConfigurationResult_QNAME, String.class, ExportConfigurationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = ImportConfiguration.class)
    public JAXBElement<Application> createImportConfigurationApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, ImportConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "sourceConfigurationXml", scope = ImportConfiguration.class)
    public JAXBElement<String> createImportConfigurationSourceConfigurationXml(String value) {
        return new JAXBElement<String>(_ImportConfigurationSourceConfigurationXml_QNAME, String.class, ImportConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "targetHeaderDetail", scope = ImportConfiguration.class)
    public JAXBElement<HeaderDetail> createImportConfigurationTargetHeaderDetail(HeaderDetail value) {
        return new JAXBElement<HeaderDetail>(_ImportConfigurationTargetHeaderDetail_QNAME, HeaderDetail.class, ImportConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationSummary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfigurationSummary }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ImportConfigurationResult", scope = ImportConfigurationResponse.class)
    public JAXBElement<ConfigurationSummary> createImportConfigurationResponseImportConfigurationResult(ConfigurationSummary value) {
        return new JAXBElement<ConfigurationSummary>(_ImportConfigurationResponseImportConfigurationResult_QNAME, ConfigurationSummary.class, ImportConfigurationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "inputParameters", scope = QueueConfiguration.class)
    public JAXBElement<InputParameters> createQueueConfigurationInputParameters(InputParameters value) {
        return new JAXBElement<InputParameters>(_ConfigureInputParameters_QNAME, InputParameters.class, QueueConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "queueConfigurationType", scope = QueueConfiguration.class)
    public JAXBElement<String> createQueueConfigurationQueueConfigurationType(String value) {
        return new JAXBElement<String>(_QueueConfigurationQueueConfigurationType_QNAME, String.class, QueueConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "QueueConfigurationResult", scope = QueueConfigurationResponse.class)
    public JAXBElement<String> createQueueConfigurationResponseQueueConfigurationResult(String value) {
        return new JAXBElement<String>(_QueueConfigurationResponseQueueConfigurationResult_QNAME, String.class, QueueConfigurationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = GetQueuedStatus.class)
    public JAXBElement<Application> createGetQueuedStatusApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, GetQueuedStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "requestId", scope = GetQueuedStatus.class)
    public JAXBElement<String> createGetQueuedStatusRequestId(String value) {
        return new JAXBElement<String>(_GetQueuedStatusRequestId_QNAME, String.class, GetQueuedStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = SetMfgTemplate.class)
    public JAXBElement<Application> createSetMfgTemplateApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, SetMfgTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "templateName", scope = SetMfgTemplate.class)
    public JAXBElement<String> createSetMfgTemplateTemplateName(String value) {
        return new JAXBElement<String>(_SetMfgTemplateTemplateName_QNAME, String.class, SetMfgTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMfgTemplateAttribute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMfgTemplateAttribute }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "attributes", scope = SetMfgTemplate.class)
    public JAXBElement<ArrayOfMfgTemplateAttribute> createSetMfgTemplateAttributes(ArrayOfMfgTemplateAttribute value) {
        return new JAXBElement<ArrayOfMfgTemplateAttribute>(_SetMfgTemplateAttributes_QNAME, ArrayOfMfgTemplateAttribute.class, SetMfgTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = SetIntegrationTemplate.class)
    public JAXBElement<Application> createSetIntegrationTemplateApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, SetIntegrationTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "templateName", scope = SetIntegrationTemplate.class)
    public JAXBElement<String> createSetIntegrationTemplateTemplateName(String value) {
        return new JAXBElement<String>(_SetMfgTemplateTemplateName_QNAME, String.class, SetIntegrationTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "templateDescription", scope = SetIntegrationTemplate.class)
    public JAXBElement<String> createSetIntegrationTemplateTemplateDescription(String value) {
        return new JAXBElement<String>(_SetIntegrationTemplateTemplateDescription_QNAME, String.class, SetIntegrationTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationTemplateAttribute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationTemplateAttribute }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "attributes", scope = SetIntegrationTemplate.class)
    public JAXBElement<ArrayOfIntegrationTemplateAttribute> createSetIntegrationTemplateAttributes(ArrayOfIntegrationTemplateAttribute value) {
        return new JAXBElement<ArrayOfIntegrationTemplateAttribute>(_SetMfgTemplateAttributes_QNAME, ArrayOfIntegrationTemplateAttribute.class, SetIntegrationTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = DeleteIntegrationTemplate.class)
    public JAXBElement<Application> createDeleteIntegrationTemplateApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, DeleteIntegrationTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "templateName", scope = DeleteIntegrationTemplate.class)
    public JAXBElement<String> createDeleteIntegrationTemplateTemplateName(String value) {
        return new JAXBElement<String>(_SetMfgTemplateTemplateName_QNAME, String.class, DeleteIntegrationTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = LoadIntegrationOutputData.class)
    public JAXBElement<Application> createLoadIntegrationOutputDataApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, LoadIntegrationOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "headerDetail", scope = LoadIntegrationOutputData.class)
    public JAXBElement<HeaderDetail> createLoadIntegrationOutputDataHeaderDetail(HeaderDetail value) {
        return new JAXBElement<HeaderDetail>(_LoadConfigurationHeaderDetail_QNAME, HeaderDetail.class, LoadIntegrationOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "templateId", scope = LoadIntegrationOutputData.class)
    public JAXBElement<String> createLoadIntegrationOutputDataTemplateId(String value) {
        return new JAXBElement<String>(_LoadIntegrationOutputDataTemplateId_QNAME, String.class, LoadIntegrationOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationOutputDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfIntegrationOutputDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "LoadIntegrationOutputDataResult", scope = LoadIntegrationOutputDataResponse.class)
    public JAXBElement<ArrayOfIntegrationOutputDto> createLoadIntegrationOutputDataResponseLoadIntegrationOutputDataResult(ArrayOfIntegrationOutputDto value) {
        return new JAXBElement<ArrayOfIntegrationOutputDto>(_LoadIntegrationOutputDataResponseLoadIntegrationOutputDataResult_QNAME, ArrayOfIntegrationOutputDto.class, LoadIntegrationOutputDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = LoadMfgData.class)
    public JAXBElement<Application> createLoadMfgDataApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, LoadMfgData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "headerDetail", scope = LoadMfgData.class)
    public JAXBElement<HeaderDetail> createLoadMfgDataHeaderDetail(HeaderDetail value) {
        return new JAXBElement<HeaderDetail>(_LoadConfigurationHeaderDetail_QNAME, HeaderDetail.class, LoadMfgData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBomComponentDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBomComponentDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "LoadMfgDataResult", scope = LoadMfgDataResponse.class)
    public JAXBElement<ArrayOfBomComponentDto> createLoadMfgDataResponseLoadMfgDataResult(ArrayOfBomComponentDto value) {
        return new JAXBElement<ArrayOfBomComponentDto>(_LoadMfgDataResponseLoadMfgDataResult_QNAME, ArrayOfBomComponentDto.class, LoadMfgDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = SetPredefinedComponentAttribute.class)
    public JAXBElement<Application> createSetPredefinedComponentAttributeApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, SetPredefinedComponentAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PredefinedComponentAttribute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PredefinedComponentAttribute }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "attribute", scope = SetPredefinedComponentAttribute.class)
    public JAXBElement<PredefinedComponentAttribute> createSetPredefinedComponentAttributeAttribute(PredefinedComponentAttribute value) {
        return new JAXBElement<PredefinedComponentAttribute>(_SetPredefinedComponentAttributeAttribute_QNAME, PredefinedComponentAttribute.class, SetPredefinedComponentAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = DeletePredefinedComponentAttribute.class)
    public JAXBElement<Application> createDeletePredefinedComponentAttributeApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, DeletePredefinedComponentAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "name", scope = DeletePredefinedComponentAttribute.class)
    public JAXBElement<String> createDeletePredefinedComponentAttributeName(String value) {
        return new JAXBElement<String>(_DeletePredefinedComponentAttributeName_QNAME, String.class, DeletePredefinedComponentAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = LoadComponentData.class)
    public JAXBElement<Application> createLoadComponentDataApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, LoadComponentData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "headerDetail", scope = LoadComponentData.class)
    public JAXBElement<HeaderDetail> createLoadComponentDataHeaderDetail(HeaderDetail value) {
        return new JAXBElement<HeaderDetail>(_LoadConfigurationHeaderDetail_QNAME, HeaderDetail.class, LoadComponentData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfComponentDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfComponentDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "LoadComponentDataResult", scope = LoadComponentDataResponse.class)
    public JAXBElement<ArrayOfComponentDto> createLoadComponentDataResponseLoadComponentDataResult(ArrayOfComponentDto value) {
        return new JAXBElement<ArrayOfComponentDto>(_LoadComponentDataResponseLoadComponentDataResult_QNAME, ArrayOfComponentDto.class, LoadComponentDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "application", scope = LoadUIData.class)
    public JAXBElement<Application> createLoadUIDataApplication(Application value) {
        return new JAXBElement<Application>(_GetCompletedConfigurationsApplication_QNAME, Application.class, LoadUIData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "headerDetail", scope = LoadUIData.class)
    public JAXBElement<HeaderDetail> createLoadUIDataHeaderDetail(HeaderDetail value) {
        return new JAXBElement<HeaderDetail>(_LoadConfigurationHeaderDetail_QNAME, HeaderDetail.class, LoadUIData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPageDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPageDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "LoadUIDataResult", scope = LoadUIDataResponse.class)
    public JAXBElement<ArrayOfPageDto> createLoadUIDataResponseLoadUIDataResult(ArrayOfPageDto value) {
        return new JAXBElement<ArrayOfPageDto>(_LoadUIDataResponseLoadUIDataResult_QNAME, ArrayOfPageDto.class, LoadUIDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "contractApplication", scope = LoadInprogressInputParameters.class)
    public JAXBElement<Application> createLoadInprogressInputParametersContractApplication(Application value) {
        return new JAXBElement<Application>(_LoadInprogressInputParametersContractApplication_QNAME, Application.class, LoadInprogressInputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "headerDetail", scope = LoadInprogressInputParameters.class)
    public JAXBElement<HeaderDetail> createLoadInprogressInputParametersHeaderDetail(HeaderDetail value) {
        return new JAXBElement<HeaderDetail>(_LoadConfigurationHeaderDetail_QNAME, HeaderDetail.class, LoadInprogressInputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InputParameters }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "LoadInprogressInputParametersResult", scope = LoadInprogressInputParametersResponse.class)
    public JAXBElement<InputParameters> createLoadInprogressInputParametersResponseLoadInprogressInputParametersResult(InputParameters value) {
        return new JAXBElement<InputParameters>(_LoadInprogressInputParametersResponseLoadInprogressInputParametersResult_QNAME, InputParameters.class, LoadInprogressInputParametersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "contractApplication", scope = GetApplications.class)
    public JAXBElement<Application> createGetApplicationsContractApplication(Application value) {
        return new JAXBElement<Application>(_LoadInprogressInputParametersContractApplication_QNAME, Application.class, GetApplications.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "GetApplicationsResult", scope = GetApplicationsResponse.class)
    public JAXBElement<ArrayOfstring> createGetApplicationsResponseGetApplicationsResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetApplicationsResponseGetApplicationsResult_QNAME, ArrayOfstring.class, GetApplicationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "contractApplication", scope = Exists.class)
    public JAXBElement<Application> createExistsContractApplication(Application value) {
        return new JAXBElement<Application>(_LoadInprogressInputParametersContractApplication_QNAME, Application.class, Exists.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "headerId", scope = Exists.class)
    public JAXBElement<String> createExistsHeaderId(String value) {
        return new JAXBElement<String>(_LoadAllConfigurationsHeaderId_QNAME, String.class, Exists.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "detailId", scope = Exists.class)
    public JAXBElement<String> createExistsDetailId(String value) {
        return new JAXBElement<String>(_ExistsDetailId_QNAME, String.class, Exists.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "DefaultValue", scope = IntegrationTemplateAttribute.class)
    public JAXBElement<String> createIntegrationTemplateAttributeDefaultValue(String value) {
        return new JAXBElement<String>(_IntegrationTemplateAttributeDefaultValue_QNAME, String.class, IntegrationTemplateAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "Description", scope = IntegrationTemplateAttribute.class)
    public JAXBElement<String> createIntegrationTemplateAttributeDescription(String value) {
        return new JAXBElement<String>(_IntegrationTemplateAttributeDescription_QNAME, String.class, IntegrationTemplateAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "DefaultValue", scope = MfgTemplateAttribute.class)
    public JAXBElement<String> createMfgTemplateAttributeDefaultValue(String value) {
        return new JAXBElement<String>(_IntegrationTemplateAttributeDefaultValue_QNAME, String.class, MfgTemplateAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "Description", scope = MfgTemplateAttribute.class)
    public JAXBElement<String> createMfgTemplateAttributeDescription(String value) {
        return new JAXBElement<String>(_IntegrationTemplateAttributeDescription_QNAME, String.class, MfgTemplateAttribute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "Content", scope = ConfigurationSummary.class)
    public JAXBElement<ArrayOfstring> createConfigurationSummaryContent(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ConfigurationSummaryContent_QNAME, ArrayOfstring.class, ConfigurationSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "ProofingDetails", scope = ConfigurationSummary.class)
    public JAXBElement<ArrayOfDetail> createConfigurationSummaryProofingDetails(ArrayOfDetail value) {
        return new JAXBElement<ArrayOfDetail>(_ConfigurationSummaryProofingDetails_QNAME, ArrayOfDetail.class, ConfigurationSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://infor.com/pcm/v3", name = "User", scope = Application.class)
    public JAXBElement<String> createApplicationUser(String value) {
        return new JAXBElement<String>(_ApplicationUser_QNAME, String.class, Application.class, value);
    }

}
