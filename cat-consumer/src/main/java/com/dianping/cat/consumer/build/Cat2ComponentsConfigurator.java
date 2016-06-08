package com.dianping.cat.consumer.build;

import java.util.ArrayList;
import java.util.List;

import org.unidal.cat.config.internal.DBConfigManager;
import com.dianping.cat.service.ProjectService;
import org.unidal.cat.plugin.event.EventPipeline;
import org.unidal.cat.plugin.problem.ProblemPipeline;
import org.unidal.cat.plugin.transaction.TransactionAllReportMaker;
import org.unidal.cat.plugin.transaction.TransactionConfigProvider;
import org.unidal.cat.plugin.transaction.TransactionPipeline;
import org.unidal.lookup.configuration.AbstractResourceConfigurator;
import org.unidal.lookup.configuration.Component;

public class Cat2ComponentsConfigurator extends AbstractResourceConfigurator {
	@Override
	public List<Component> defineComponents() {
		List<Component> all = new ArrayList<Component>();

		all.add(A(TransactionPipeline.class));
        all.add(A(TransactionConfigProvider.class));

        all.add(A(EventPipeline.class));

		all.add(A(ProblemPipeline.class));

        all.add(A(DBConfigManager.class));
		all.add(A(ProjectService.class));

		return all;
	}
}
