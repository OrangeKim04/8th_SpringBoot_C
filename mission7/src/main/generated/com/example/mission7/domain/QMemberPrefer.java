package com.example.mission7.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberPrefer is a Querydsl query type for MemberPrefer
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberPrefer extends EntityPathBase<MemberPrefer> {

    private static final long serialVersionUID = -1218182558L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberPrefer memberPrefer = new QMemberPrefer("memberPrefer");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final QFoodCategory category;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final ComparablePath<java.util.UUID> id = _super.id;

    public final QMember member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updated_at = _super.updated_at;

    public QMemberPrefer(String variable) {
        this(MemberPrefer.class, forVariable(variable), INITS);
    }

    public QMemberPrefer(Path<? extends MemberPrefer> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberPrefer(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberPrefer(PathMetadata metadata, PathInits inits) {
        this(MemberPrefer.class, metadata, inits);
    }

    public QMemberPrefer(Class<? extends MemberPrefer> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new QFoodCategory(forProperty("category")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}

