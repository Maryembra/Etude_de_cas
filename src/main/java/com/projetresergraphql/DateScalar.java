package com.projetresergraphql;

import graphql.language.StringValue;
import graphql.schema.Coercing;
import graphql.schema.CoercingParseLiteralException;
import graphql.schema.CoercingParseValueException;
import graphql.schema.CoercingSerializeException;
import graphql.schema.GraphQLScalarType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateScalar {
    public static final GraphQLScalarType DATE = GraphQLScalarType.newScalar()
            .name("Date")
            .description("Custom scalar for Date type")
            .coercing(new Coercing<Date, String>() {
                private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                @Override
                public String serialize(Object dataFetcherResult) {
                    if (dataFetcherResult instanceof Date) {
                        return dateFormat.format(dataFetcherResult);
                    }
                    throw new CoercingSerializeException("Invalid type for Date serialization");
                }

                @Override
                public Date parseValue(Object input) {
                    if (input instanceof String) {
                        try {
                            return dateFormat.parse((String) input);
                        } catch (ParseException e) {
                            throw new CoercingParseValueException("Invalid date format");
                        }
                    }
                    throw new CoercingParseValueException("Invalid input for Date");
                }

                @Override
                public Date parseLiteral(Object input) {
                    if (input instanceof StringValue) {
                        try {
                            return dateFormat.parse(((StringValue) input).getValue());
                        } catch (ParseException e) {
                            throw new CoercingParseLiteralException("Invalid date format");
                        }
                    }
                    throw new CoercingParseLiteralException("Invalid literal for Date");
                }
            })
            .build();
}
