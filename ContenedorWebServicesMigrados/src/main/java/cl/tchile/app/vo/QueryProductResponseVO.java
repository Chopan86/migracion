/**
 * 
 */
package cl.tchile.app.vo;

import java.math.BigInteger;
import java.util.List;


/**
 * The Class QueryProductResponseVO.
 */
public class QueryProductResponseVO {
	
	/** responseMsj */
    private ResponseMsj ResponseMsj;
    /** responseData */
    private Product ResponseData;
        
    /**
	 * @return the responseMsj
	 */
	public ResponseMsj getResponseMsj() {
		return ResponseMsj;
	}

	/**
	 * @param responseMsj the responseMsj to set
	 */
	public void setResponseMsj(ResponseMsj responseMsj) {
		this.ResponseMsj = responseMsj;
	}

	/**
	 * @return the responseData
	 */
	public Product getResponseData() {
		return ResponseData;
	}

	/**
	 * @param responseData the responseData to set
	 */
	public void setResponseData(Product responseData) {
		this.ResponseData = responseData;
	}

	public static class ResponseMsj{
		/** codError */
	    private String codError;
	    /** msgError */
	    private String msgError;
		/**
		 * @return the codError
		 */
		/**
		 * @return the codError
		 */
		public String getCodError() {
			return codError;
		}
		/**
		 * @param codError the codError to set
		 */
		public void setCodError(String codError) {
			this.codError = codError;
		}
		/**
		 * @return the msgError
		 */
		public String getMsgError() {
			return msgError;
		}
	    
    }
    
    public static class Product{
    	/** idType */
        private String idType;
        /** id */
        private String id;
        /** name */
        private String name;
        /** description */
        private String description;
        /** productBundle */
        private List<ProductBundle> productBundle;
        
        /**
		 * @return the idType
		 */
		public String getIdType() {
			return idType;
		}



		/**
		 * @param idType the idType to set
		 */
		public void setIdType(String idType) {
			this.idType = idType;
		}



		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}



		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
		}



		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}



		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}



		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}



		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}



		/**
		 * @return the productBundle
		 */
		public List<ProductBundle> getProductBundle() {
			return productBundle;
		}



		/**
		 * @param productBundle the productBundle to set
		 */
		public void setProductBundle(List<ProductBundle> productBundle) {
			this.productBundle = productBundle;
		}



		public static class ProductBundle {
			/** idType*/
		    private String idType;
		    /** id*/
		    private String id;
		    /** name*/
		    private String name;
		    /** description*/
		    private String description;
		    /** productStatus*/
		    private String productStatus;
		    /** productSerialNumber*/
		    private String productSerialNumber;
		    
		    private ValidFor validFor;
		    private ProductCapacity productCapacity;
		    private List<ProductOffering> productOffering;
		    private List<ProductCharacteristic> productCharacteristic;
		    private Place place;
		    private ProductInvolvementRole productInvolvementRole;
		    private CustomerFacingService customerFacingService;
		    private ProductPrice productPrice;
		    private ProductSpecification productSpecification;
		    
		    
		    /**
			 * @return the idType
			 */
			public String getIdType() {
				return idType;
			}

			/**
			 * @param idType the idType to set
			 */
			public void setIdType(String idType) {
				this.idType = idType;
			}

			/**
			 * @return the id
			 */
			public String getId() {
				return id;
			}

			/**
			 * @param id the id to set
			 */
			public void setId(String id) {
				this.id = id;
			}

			/**
			 * @return the name
			 */
			public String getName() {
				return name;
			}

			/**
			 * @param name the name to set
			 */
			public void setName(String name) {
				this.name = name;
			}

			/**
			 * @return the description
			 */
			public String getDescription() {
				return description;
			}

			/**
			 * @param description the description to set
			 */
			public void setDescription(String description) {
				this.description = description;
			}

			/**
			 * @return the productStatus
			 */
			public String getProductStatus() {
				return productStatus;
			}

			/**
			 * @param productStatus the productStatus to set
			 */
			public void setProductStatus(String productStatus) {
				this.productStatus = productStatus;
			}

			/**
			 * @return the productSerialNumber
			 */
			public String getProductSerialNumber() {
				return productSerialNumber;
			}

			/**
			 * @param productSerialNumber the productSerialNumber to set
			 */
			public void setProductSerialNumber(String productSerialNumber) {
				this.productSerialNumber = productSerialNumber;
			}

			/**
			 * @return the validFor
			 */
			public ValidFor getValidFor() {
				return validFor;
			}

			/**
			 * @param validFor the validFor to set
			 */
			public void setValidFor(ValidFor validFor) {
				this.validFor = validFor;
			}

			/**
			 * @return the productCapacity
			 */
			public ProductCapacity getProductCapacity() {
				return productCapacity;
			}

			/**
			 * @param productCapacity the productCapacity to set
			 */
			public void setProductCapacity(ProductCapacity productCapacity) {
				this.productCapacity = productCapacity;
			}

			/**
			 * @return the productOffering
			 */
			public List<ProductOffering> getProductOffering() {
				return productOffering;
			}

			/**
			 * @param productOffering the productOffering to set
			 */
			public void setProductOffering(List<ProductOffering> productOffering) {
				this.productOffering = productOffering;
			}

			/**
			 * @return the productCharacteristic
			 */
			public List<ProductCharacteristic> getProductCharacteristic() {
				return productCharacteristic;
			}

			/**
			 * @param productCharacteristic the productCharacteristic to set
			 */
			public void setProductCharacteristic(List<ProductCharacteristic> productCharacteristic) {
				this.productCharacteristic = productCharacteristic;
			}

			/**
			 * @return the place
			 */
			public Place getPlace() {
				return place;
			}

			/**
			 * @param place the place to set
			 */
			public void setPlace(Place place) {
				this.place = place;
			}

			/**
			 * @return the productInvolvementRole
			 */
			public ProductInvolvementRole getProductInvolvementRole() {
				return productInvolvementRole;
			}

			/**
			 * @param productInvolvementRole the productInvolvementRole to set
			 */
			public void setProductInvolvementRole(ProductInvolvementRole productInvolvementRole) {
				this.productInvolvementRole = productInvolvementRole;
			}

			/**
			 * @return the customerFacingService
			 */
			public CustomerFacingService getCustomerFacingService() {
				return customerFacingService;
			}

			/**
			 * @param customerFacingService the customerFacingService to set
			 */
			public void setCustomerFacingService(CustomerFacingService customerFacingService) {
				this.customerFacingService = customerFacingService;
			}

			/**
			 * @return the productPrice
			 */
			public ProductPrice getProductPrice() {
				return productPrice;
			}

			/**
			 * @param productPrice the productPrice to set
			 */
			public void setProductPrice(ProductPrice productPrice) {
				this.productPrice = productPrice;
			}

			/**
			 * @return the productSpecification
			 */
			public ProductSpecification getProductSpecification() {
				return productSpecification;
			}

			/**
			 * @param productSpecification the productSpecification to set
			 */
			public void setProductSpecification(ProductSpecification productSpecification) {
				this.productSpecification = productSpecification;
			}

			public static class ValidFor{
				
				private String startDateTime;

				private String endDateTime;

				/**
				 * @return the startDateTime
				 */
				public String getStartDateTime() {
					return startDateTime;
				}

				/**
				 * @param startDateTime the startDateTime to set
				 */
				public void setStartDateTime(String startDateTime) {
					this.startDateTime = startDateTime;
				}

				/**
				 * @return the endDateTime
				 */
				public String getEndDateTime() {
					return endDateTime;
				}

				/**
				 * @param endDateTime the endDateTime to set
				 */
				public void setEndDateTime(String endDateTime) {
					this.endDateTime = endDateTime;
				}
				
				
		    }
		    
		    public static class ProductCapacity{
		    	
		    	
		    	private String plannedOrActualCapacity;

		        private Long capacityAmount;

		        private Long capacityAmountFrom;

		        private Long capacityAmountTo;

		        private String rangeInterval;

				/**
				 * @return the plannedOrActualCapacity
				 */
				public String getPlannedOrActualCapacity() {
					return plannedOrActualCapacity;
				}

				/**
				 * @param plannedOrActualCapacity the plannedOrActualCapacity to set
				 */
				public void setPlannedOrActualCapacity(String plannedOrActualCapacity) {
					this.plannedOrActualCapacity = plannedOrActualCapacity;
				}

				/**
				 * @return the capacityAmount
				 */
				public Long getCapacityAmount() {
					return capacityAmount;
				}

				/**
				 * @param capacityAmount the capacityAmount to set
				 */
				public void setCapacityAmount(Long capacityAmount) {
					this.capacityAmount = capacityAmount;
				}

				/**
				 * @return the capacityAmountFrom
				 */
				public Long getCapacityAmountFrom() {
					return capacityAmountFrom;
				}

				/**
				 * @param capacityAmountFrom the capacityAmountFrom to set
				 */
				public void setCapacityAmountFrom(Long capacityAmountFrom) {
					this.capacityAmountFrom = capacityAmountFrom;
				}

				/**
				 * @return the capacityAmountTo
				 */
				public Long getCapacityAmountTo() {
					return capacityAmountTo;
				}

				/**
				 * @param capacityAmountTo the capacityAmountTo to set
				 */
				public void setCapacityAmountTo(Long capacityAmountTo) {
					this.capacityAmountTo = capacityAmountTo;
				}

				/**
				 * @return the rangeInterval
				 */
				public String getRangeInterval() {
					return rangeInterval;
				}

				/**
				 * @param rangeInterval the rangeInterval to set
				 */
				public void setRangeInterval(String rangeInterval) {
					this.rangeInterval = rangeInterval;
				}
		        
		        
		    }
		    
		    public static class ProductOffering{
		    	private String id;
		        private String name;
		        private String description;
		        private ValidFor validFor;
		        private String status;
				/**
				 * @return the id
				 */
				public String getId() {
					return id;
				}
				/**
				 * @param id the id to set
				 */
				public void setId(String id) {
					this.id = id;
				}
				/**
				 * @return the name
				 */
				public String getName() {
					return name;
				}
				/**
				 * @param name the name to set
				 */
				public void setName(String name) {
					this.name = name;
				}
				/**
				 * @return the description
				 */
				public String getDescription() {
					return description;
				}
				/**
				 * @param description the description to set
				 */
				public void setDescription(String description) {
					this.description = description;
				}
				/**
				 * @return the validFor
				 */
				public ValidFor getValidFor() {
					return validFor;
				}
				/**
				 * @param validFor the validFor to set
				 */
				public void setValidFor(ValidFor validFor) {
					this.validFor = validFor;
				}
				/**
				 * @return the status
				 */
				public String getStatus() {
					return status;
				}
				/**
				 * @param status the status to set
				 */
				public void setStatus(String status) {
					this.status = status;
				}
		        
		        
		    }
		    
		    public static class ProductCharacteristic{
		    	private String idPs;
		      
		        private String descPs;
		      
		        private String idFam;
		      
		        private String descFam;
		      
		        private String idSubg1;
		      
		        private String descSubg1;
		      
		        private String idSubg2;
		      
		        private String descSubg2;
		      
		        private String talla;
		        private ValidFor validFor;
				/**
				 * @return the idPs
				 */
				public String getIdPs() {
					return idPs;
				}
				/**
				 * @param idPs the idPs to set
				 */
				public void setIdPs(String idPs) {
					this.idPs = idPs;
				}
				/**
				 * @return the descPs
				 */
				public String getDescPs() {
					return descPs;
				}
				/**
				 * @param descPs the descPs to set
				 */
				public void setDescPs(String descPs) {
					this.descPs = descPs;
				}
				/**
				 * @return the idFam
				 */
				public String getIdFam() {
					return idFam;
				}
				/**
				 * @param idFam the idFam to set
				 */
				public void setIdFam(String idFam) {
					this.idFam = idFam;
				}
				/**
				 * @return the descFam
				 */
				public String getDescFam() {
					return descFam;
				}
				/**
				 * @param descFam the descFam to set
				 */
				public void setDescFam(String descFam) {
					this.descFam = descFam;
				}
				/**
				 * @return the idSubg1
				 */
				public String getIdSubg1() {
					return idSubg1;
				}
				/**
				 * @param idSubg1 the idSubg1 to set
				 */
				public void setIdSubg1(String idSubg1) {
					this.idSubg1 = idSubg1;
				}
				/**
				 * @return the descSubg1
				 */
				public String getDescSubg1() {
					return descSubg1;
				}
				/**
				 * @param descSubg1 the descSubg1 to set
				 */
				public void setDescSubg1(String descSubg1) {
					this.descSubg1 = descSubg1;
				}
				/**
				 * @return the idSubg2
				 */
				public String getIdSubg2() {
					return idSubg2;
				}
				/**
				 * @param idSubg2 the idSubg2 to set
				 */
				public void setIdSubg2(String idSubg2) {
					this.idSubg2 = idSubg2;
				}
				/**
				 * @return the descSubg2
				 */
				public String getDescSubg2() {
					return descSubg2;
				}
				/**
				 * @param descSubg2 the descSubg2 to set
				 */
				public void setDescSubg2(String descSubg2) {
					this.descSubg2 = descSubg2;
				}
				/**
				 * @return the talla
				 */
				public String getTalla() {
					return talla;
				}
				/**
				 * @param talla the talla to set
				 */
				public void setTalla(String talla) {
					this.talla = talla;
				}
				/**
				 * @return the validFor
				 */
				public ValidFor getValidFor() {
					return validFor;
				}
				/**
				 * @param validFor the validFor to set
				 */
				public void setValidFor(ValidFor validFor) {
					this.validFor = validFor;
				}
		        
		        
		    }
		    
		    public static class Place{
		    	private String id;
		        private ValidFor validFor;
		        private LocalAddress localAddress;
				/**
				 * @return the id
				 */
				public String getId() {
					return id;
				}
				/**
				 * @param id the id to set
				 */
				public void setId(String id) {
					this.id = id;
				}
				/**
				 * @return the validFor
				 */
				public ValidFor getValidFor() {
					return validFor;
				}
				/**
				 * @param validFor the validFor to set
				 */
				public void setValidFor(ValidFor validFor) {
					this.validFor = validFor;
				}
				/**
				 * @return the localAddress
				 */
				public LocalAddress getLocalAddress() {
					return localAddress;
				}
				/**
				 * @param localAddress the localAddress to set
				 */
				public void setLocalAddress(LocalAddress localAddress) {
					this.localAddress = localAddress;
				}
				
				public static class LocalAddress{
					private String type;

					private String positionNr;

					private String fullAdress;

					/**
					 * @return the type
					 */
					public String getType() {
						return type;
					}

					/**
					 * @param type the type to set
					 */
					public void setType(String type) {
						this.type = type;
					}

					/**
					 * @return the positionNr
					 */
					public String getPositionNr() {
						return positionNr;
					}

					/**
					 * @param positionNr the positionNr to set
					 */
					public void setPositionNr(String positionNr) {
						this.positionNr = positionNr;
					}

					/**
					 * @return the fullAdress
					 */
					public String getFullAdress() {
						return fullAdress;
					}

					/**
					 * @param fullAdress the fullAdress to set
					 */
					public void setFullAdress(String fullAdress) {
						this.fullAdress = fullAdress;
					}
					
					

				}
		        
		        
		    }
		    
		    public static class ProductInvolvementRole{
		    	private String involvementRole;
		        private ValidFor validFor;
		        private PartyRole partyRole;
		        
		        private String involvementIdentificationRole;
		        private CustomerAccount customerAccount;
		        
		        private String resourceRole;
		        
		        
		        
		        /**
				 * @return the involvementRole
				 */
				public String getInvolvementRole() {
					return involvementRole;
				}

				/**
				 * @param involvementRole the involvementRole to set
				 */
				public void setInvolvementRole(String involvementRole) {
					this.involvementRole = involvementRole;
				}

				/**
				 * @return the validFor
				 */
				public ValidFor getValidFor() {
					return validFor;
				}

				/**
				 * @param validFor the validFor to set
				 */
				public void setValidFor(ValidFor validFor) {
					this.validFor = validFor;
				}

				/**
				 * @return the partyRole
				 */
				public PartyRole getPartyRole() {
					return partyRole;
				}

				/**
				 * @param partyRole the partyRole to set
				 */
				public void setPartyRole(PartyRole partyRole) {
					this.partyRole = partyRole;
				}

				/**
				 * @return the involvementIdentificationRole
				 */
				public String getInvolvementIdentificationRole() {
					return involvementIdentificationRole;
				}

				/**
				 * @param involvementIdentificationRole the involvementIdentificationRole to set
				 */
				public void setInvolvementIdentificationRole(String involvementIdentificationRole) {
					this.involvementIdentificationRole = involvementIdentificationRole;
				}

				/**
				 * @return the customerAccount
				 */
				public CustomerAccount getCustomerAccount() {
					return customerAccount;
				}

				/**
				 * @param customerAccount the customerAccount to set
				 */
				public void setCustomerAccount(CustomerAccount customerAccount) {
					this.customerAccount = customerAccount;
				}

				/**
				 * @return the resourceRole
				 */
				public String getResourceRole() {
					return resourceRole;
				}

				/**
				 * @param resourceRole the resourceRole to set
				 */
				public void setResourceRole(String resourceRole) {
					this.resourceRole = resourceRole;
				}

				public static class PartyRole{
		        	private String partyRoleId;

		            private String status;
		            private ValidFor validFor;

		            private String name;

					/**
					 * @return the partyRoleId
					 */
					public String getPartyRoleId() {
						return partyRoleId;
					}

					/**
					 * @param partyRoleId the partyRoleId to set
					 */
					public void setPartyRoleId(String partyRoleId) {
						this.partyRoleId = partyRoleId;
					}

					/**
					 * @return the status
					 */
					public String getStatus() {
						return status;
					}

					/**
					 * @param status the status to set
					 */
					public void setStatus(String status) {
						this.status = status;
					}

					/**
					 * @return the validFor
					 */
					public ValidFor getValidFor() {
						return validFor;
					}

					/**
					 * @param validFor the validFor to set
					 */
					public void setValidFor(ValidFor validFor) {
						this.validFor = validFor;
					}

					/**
					 * @return the name
					 */
					public String getName() {
						return name;
					}

					/**
					 * @param name the name to set
					 */
					public void setName(String name) {
						this.name = name;
					}
		            
		            

		        }
		        
		        public static class CustomerAccount{
		        	private String id;
		            
		            private String name;
		            
		            private String accountType;
		            
		            private String accountStatus;
		            
		            private Long creditLimit;
		            
		            private String pin;

					/**
					 * @return the id
					 */
					public String getId() {
						return id;
					}

					/**
					 * @param id the id to set
					 */
					public void setId(String id) {
						this.id = id;
					}

					/**
					 * @return the name
					 */
					public String getName() {
						return name;
					}

					/**
					 * @param name the name to set
					 */
					public void setName(String name) {
						this.name = name;
					}

					/**
					 * @return the accountType
					 */
					public String getAccountType() {
						return accountType;
					}

					/**
					 * @param accountType the accountType to set
					 */
					public void setAccountType(String accountType) {
						this.accountType = accountType;
					}

					/**
					 * @return the accountStatus
					 */
					public String getAccountStatus() {
						return accountStatus;
					}

					/**
					 * @param accountStatus the accountStatus to set
					 */
					public void setAccountStatus(String accountStatus) {
						this.accountStatus = accountStatus;
					}

					/**
					 * @return the creditLimit
					 */
					public Long getCreditLimit() {
						return creditLimit;
					}

					/**
					 * @param creditLimit the creditLimit to set
					 */
					public void setCreditLimit(Long creditLimit) {
						this.creditLimit = creditLimit;
					}

					/**
					 * @return the pin
					 */
					public String getPin() {
						return pin;
					}

					/**
					 * @param pin the pin to set
					 */
					public void setPin(String pin) {
						this.pin = pin;
					}
		            
		            
		        }
		        
		        
		    }
		    
		    public static class CustomerFacingService{
		    	private Boolean isServiceEnabled;
		        
		        private Boolean hasStarted;
		        
		        private Boolean isMandatory;
		        
		        private BigInteger startMode;
		        
		        private Boolean isStateful;
		        
		        private String commonName;
		        
		        private String description;
		        
		        private String objectID;
		        
		        private BigInteger cfsStatus;
		        private List<ProductCharacteristic> productCharacteristic;
				/**
				 * @return the isServiceEnabled
				 */
				public Boolean getIsServiceEnabled() {
					return isServiceEnabled;
				}
				/**
				 * @param isServiceEnabled the isServiceEnabled to set
				 */
				public void setIsServiceEnabled(Boolean isServiceEnabled) {
					this.isServiceEnabled = isServiceEnabled;
				}
				/**
				 * @return the hasStarted
				 */
				public Boolean getHasStarted() {
					return hasStarted;
				}
				/**
				 * @param hasStarted the hasStarted to set
				 */
				public void setHasStarted(Boolean hasStarted) {
					this.hasStarted = hasStarted;
				}
				/**
				 * @return the isMandatory
				 */
				public Boolean getIsMandatory() {
					return isMandatory;
				}
				/**
				 * @param isMandatory the isMandatory to set
				 */
				public void setIsMandatory(Boolean isMandatory) {
					this.isMandatory = isMandatory;
				}
				/**
				 * @return the startMode
				 */
				public BigInteger getStartMode() {
					return startMode;
				}
				/**
				 * @param startMode the startMode to set
				 */
				public void setStartMode(BigInteger startMode) {
					this.startMode = startMode;
				}
				/**
				 * @return the isStateful
				 */
				public Boolean getIsStateful() {
					return isStateful;
				}
				/**
				 * @param isStateful the isStateful to set
				 */
				public void setIsStateful(Boolean isStateful) {
					this.isStateful = isStateful;
				}
				/**
				 * @return the commonName
				 */
				public String getCommonName() {
					return commonName;
				}
				/**
				 * @param commonName the commonName to set
				 */
				public void setCommonName(String commonName) {
					this.commonName = commonName;
				}
				/**
				 * @return the description
				 */
				public String getDescription() {
					return description;
				}
				/**
				 * @param description the description to set
				 */
				public void setDescription(String description) {
					this.description = description;
				}
				/**
				 * @return the objectID
				 */
				public String getObjectID() {
					return objectID;
				}
				/**
				 * @param objectID the objectID to set
				 */
				public void setObjectID(String objectID) {
					this.objectID = objectID;
				}
				/**
				 * @return the cfsStatus
				 */
				public BigInteger getCfsStatus() {
					return cfsStatus;
				}
				/**
				 * @param cfsStatus the cfsStatus to set
				 */
				public void setCfsStatus(BigInteger cfsStatus) {
					this.cfsStatus = cfsStatus;
				}
				/**
				 * @return the productCharacteristic
				 */
				public List<ProductCharacteristic> getProductCharacteristic() {
					return productCharacteristic;
				}
				/**
				 * @param productCharacteristic the productCharacteristic to set
				 */
				public void setProductCharacteristic(List<ProductCharacteristic> productCharacteristic) {
					this.productCharacteristic = productCharacteristic;
				}
		        
		        

		    }
		    
		    public static class ProductPrice{
		    	private String id;

		        private String name;

		        private String description;
		        private ValidFor validFor;
				/**
				 * @return the id
				 */
				public String getId() {
					return id;
				}
				/**
				 * @param id the id to set
				 */
				public void setId(String id) {
					this.id = id;
				}
				/**
				 * @return the name
				 */
				public String getName() {
					return name;
				}
				/**
				 * @param name the name to set
				 */
				public void setName(String name) {
					this.name = name;
				}
				/**
				 * @return the description
				 */
				public String getDescription() {
					return description;
				}
				/**
				 * @param description the description to set
				 */
				public void setDescription(String description) {
					this.description = description;
				}
				/**
				 * @return the validFor
				 */
				public ValidFor getValidFor() {
					return validFor;
				}
				/**
				 * @param validFor the validFor to set
				 */
				public void setValidFor(ValidFor validFor) {
					this.validFor = validFor;
				}
		        
		        

		    }
		    
		    public static class ProductSpecification{
		    	
		    	    private String id;
		    	   
		    	    private String name;
		    	   
		    	    private String description;
		    	   
		    	    private String productNumber;
		    	   
		    	    private String brand;
		    	    private ValidFor validFor;
		    	   
		    	    private String lifecycleStatus;

					/**
					 * @return the id
					 */
					public String getId() {
						return id;
					}

					/**
					 * @param id the id to set
					 */
					public void setId(String id) {
						this.id = id;
					}

					/**
					 * @return the name
					 */
					public String getName() {
						return name;
					}

					/**
					 * @param name the name to set
					 */
					public void setName(String name) {
						this.name = name;
					}

					/**
					 * @return the description
					 */
					public String getDescription() {
						return description;
					}

					/**
					 * @param description the description to set
					 */
					public void setDescription(String description) {
						this.description = description;
					}

					/**
					 * @return the productNumber
					 */
					public String getProductNumber() {
						return productNumber;
					}

					/**
					 * @param productNumber the productNumber to set
					 */
					public void setProductNumber(String productNumber) {
						this.productNumber = productNumber;
					}

					/**
					 * @return the brand
					 */
					public String getBrand() {
						return brand;
					}

					/**
					 * @param brand the brand to set
					 */
					public void setBrand(String brand) {
						this.brand = brand;
					}

					/**
					 * @return the validFor
					 */
					public ValidFor getValidFor() {
						return validFor;
					}

					/**
					 * @param validFor the validFor to set
					 */
					public void setValidFor(ValidFor validFor) {
						this.validFor = validFor;
					}

					/**
					 * @return the lifecycleStatus
					 */
					public String getLifecycleStatus() {
						return lifecycleStatus;
					}

					/**
					 * @param lifecycleStatus the lifecycleStatus to set
					 */
					public void setLifecycleStatus(String lifecycleStatus) {
						this.lifecycleStatus = lifecycleStatus;
					}
		    	    
		    	    
		    }
        }
        
    }
}
