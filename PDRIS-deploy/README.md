# PDRIS Deploy (Ansible)

Ansible-скрипты для деплоя `devops_sem_task5_project` на целевой хост.

## Переменные

- `artifact_url` — URL до jar в Nexus (если задан, будет скачан на хост)
- `artifact_local_path` — путь до jar на Jenkins/контроллере (если задан, будет скопирован на хост)
- `deploy_dir` — каталог установки (default: `/opt/pdris`)
- `service_name` — имя сервиса (default: `devops_sem_task5_project`)

## Запуск

```bash
cd ansible
ansible-playbook -i inventory/hosts.ini playbooks/deploy.yml \
  -e artifact_url=http://nexus:8081/repository/pdris/devops_sem_task5_project/devops_sem_task5_project.jar
```

