package com.vinra.ids.vinra.controller.mapper;

import com.vinra.ids.vinra.controller.dto.TransactionDTO;
import com.vinra.ids.vinra.entity.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TransactionDTOMapper {

	@Mapping(source = "product.id", target = "productID")
	@Mapping(source = "product.name", target = "productName")
	@Mapping(source = "customer.name", target = "customerName")
	@Mapping(source = "auditFields.createdAt", target = "createOn")
	TransactionDTO toDto(Transaction transaction);
}
